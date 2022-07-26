import java.util.HashMap;

/**
 * Created by cesarwillymamanicanaza on 25/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class SumFactor {

    static int sumFactor(int[ ] a){
        HashMap<Integer, Integer> countNumbers = new HashMap<>();
        int sum = 0;
        for (int index : a){
            countNumbers.put(index,countNumbers.getOrDefault(index,0)+1);
            sum += index;
        }
        return countNumbers.getOrDefault(sum,0);
    }
    public static void main(String[] args) {
        System.out.println(
                "Result: " + sumFactor(new int[]{3, 0, 2, -5, 0})
        );
        System.out.println(
                "Result: " + sumFactor(new int[]{9, -3, -3, -1, -1})
        );
        System.out.println(
                "Result: " + sumFactor(new int[]{1})
        );
        System.out.println(
                "Result: " + sumFactor(new int[]{0,0,0})
        );
        System.out.println(
                "Result: " + sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1})
        );
        System.out.println(
                "Result: " + sumFactor(new int[]{1, 2, 3, 4})
        );
    }
}
