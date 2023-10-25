public class Sage extends Thread {
    private int id;
    private Object monitor;
    private final int countEating = 3;

    @Override
    public void run() {
        int count = 1;
        while (count <= countEating) {
            System.out.printf(id + "-й мудрец обедает в %d раз... \n", count);
            count++;
            try {
                synchronized (monitor) {

                    monitor.notify();

                    if (count <= countEating) {
                        monitor.wait();
                    }
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Sage(int id) {
        this.id = id;
        this.monitor = Sage.class;
    }
}
