package algorithms;

import java.util.Date;
import java.util.List;

public class SimpleSearch {
    public void findNemo(List<String> list) {
        long start = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Nemo")) {
                System.out.println("Found NEMO!");
            }
        }

        long finish = System.nanoTime();
        double timeToRun = (finish - start) / 1_000_000.0; //Convert to milliseconds
        System.out.println("This took: " + timeToRun + " milliseconds to run");
    }
}
