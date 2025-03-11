import java.util.ArrayList;
import java.util.List;

public class SimpleSearch {
    public List<String> simpleList = new ArrayList<>();

    public void findNemo(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Nemo")) {
                System.out.println("Found NEMO!");
            }
        }
    }
}
