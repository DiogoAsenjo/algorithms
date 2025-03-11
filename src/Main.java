import algorithms.SimpleSearch;
import fakeData.ListString;

public class Main {
    public static void main(String[] args) {
        SimpleSearch simpleSearch = new SimpleSearch();
        ListString listString = new ListString();
        listString.addNemoInARandomPosition();

        simpleSearch.findNemo(listString.listString);
    }
}