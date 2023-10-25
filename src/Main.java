import java.util.List;

public class Main {
    public static void main(String[] args) {
        int countSages = 5;
        Room room = new Room();
        List<Sage> sageList = room.getSageList();
        for (int i = 0; i < countSages; i++) {
            sageList.add(new Sage(i + 1));
        }
        room.start();

    }
}