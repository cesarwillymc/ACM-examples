import java.util.HashMap;

/**
 * Created by cesarwillymamanicanaza on 29/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsSequentiallyBounded {
    static int isSequentiallyBounded(int[] a) {
        if (a.length == 0) return 1;
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int isSequentially = 1;
        int previousNumber= a[0];
        for (int index: a){
            numbers.put(index, numbers.getOrDefault(index,0));
            if(numbers.getOrDefault(index,0)>=index || previousNumber > index){
                isSequentially = 0;
                break;
            }
            previousNumber = index;
        }
        return isSequentially;
    }

    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 4, 5, 6}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 5, 4, 6}));
    }
}
