package fakeData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListString {
    public List<String> listString = new ArrayList<>(Collections.nCopies(1000000, "Not Nemo"));

    public void addNemoInARandomPosition() {
        Random random = new Random();
        int randomPosition = random.nextInt(this.listString.size());
        this.listString.set(randomPosition, "Nemo");
    }
}
