import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by cesarwillymamanicanaza on 27/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsSumSafe {
    static int isSumSafe(int[] a) {
        int sum = 0;
        HashSet<Integer> numbers = new  HashSet<>();
        for (int index : a) {
            numbers.add(index);
            sum+=index;
        }
        return numbers.contains(sum)?0:1;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isSumSafe(new int[]{5, -5, 0}));
        System.out.println("Result: " + isSumSafe(new int[]{5, -2, 1}));
    }
}
