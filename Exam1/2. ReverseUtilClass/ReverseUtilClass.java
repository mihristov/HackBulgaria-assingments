import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseUtilClass {
    public static List<Integer> reverse(List<Integer> myList) {
        List<Integer> newList = new ArrayList<Integer>(myList);
        Collections.reverse(newList);
        return newList;
    }
}
