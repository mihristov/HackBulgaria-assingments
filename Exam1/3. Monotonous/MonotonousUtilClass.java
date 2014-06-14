import java.util.Arrays;
import java.util.List;

public class MonotonousUtilClass {
    public boolean isMonotonous(List<Integer> myList) {
        return SortUtilClass.sort(myList).equals(myList)
                || ReverseUtilClass.reverse(SortUtilClass.sort(myList)).equals(myList);
    }

    public static void main(String[] args) {
        MonotonousUtilClass asd = new MonotonousUtilClass();
        System.out.println(asd.isMonotonous(Arrays.asList(1, 2, 1, 4, 5, 4)));
    }
}
