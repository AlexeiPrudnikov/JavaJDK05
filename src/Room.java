import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Sage> sageList = new ArrayList<>();
    public List<Sage> getSageList() {
        return sageList;
    }
    public void start(){
        for (Sage sage:sageList) {
            sage.start();
        }
    }
}
