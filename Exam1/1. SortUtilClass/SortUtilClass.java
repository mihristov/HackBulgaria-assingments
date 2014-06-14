import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUtilClass {
    public static List<Integer> sort(List<Integer> myList) {
        List<Integer> newList = new ArrayList<Integer>(myList);
        Collections.sort(newList);
        return newList;
    }
}
