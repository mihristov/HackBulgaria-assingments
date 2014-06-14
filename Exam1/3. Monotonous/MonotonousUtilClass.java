import java.util.List;

public class MonotonousUtilClass {
    public static boolean isMonotonous(List<Integer> myList) {
        return SortUtilClass.sort(myList).equals(myList)
                || ReverseUtilClass.reverse(SortUtilClass.sort(myList)).equals(myList);
    }
}
