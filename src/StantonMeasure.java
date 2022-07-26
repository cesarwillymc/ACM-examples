import java.util.HashMap;

/**
 * Created by cesarwillymamanicanaza on 25/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class StantonMeasure {
    static int stantonMeasure(int[] a) {
        if (a.length == 0) return 0;
        HashMap<Integer, Integer> numberCount = new HashMap<>();
        for (int index : a) {
            numberCount.put(index, numberCount.getOrDefault(index, 0)+1);
        }
        return numberCount.getOrDefault(numberCount.getOrDefault(1, 0), 0);
    }

    public static void main(String[] args) {
        System.out.println(
                "Result: " + stantonMeasure(new int[]{1})
        );
        System.out.println(
                "Result: " + stantonMeasure(new int[]{0})
        );
        System.out.println(
                "Result: " + stantonMeasure(new int[]{3, 1, 1, 4})
        );
        System.out.println(
                "Result: " + stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4})
        );
        System.out.println(
                "Result: " + stantonMeasure(new int[]{})
        );
        System.out.println(
                "Result: " + stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3, 2})
        );
    }
}
