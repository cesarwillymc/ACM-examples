import java.util.HashSet;

/**
 * Created by cesarwillymamanicanaza on 22/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class CountSquarePairs {
    static boolean isPerfectSquare(int n) {
        int numberMultiple = (int) Math.pow(n, 0.5);
        return (numberMultiple * numberMultiple) == n;
    }

    static int countSquarePairs(int[] a) {
        int counterPerfect = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index] <= 0) {
                index++;
            }
            for (int start = index + 1; start < a.length; start++) {
                if (a[start] <= 0) {
                    continue;
                }
                if (isPerfectSquare(a[index] + a[start])) {
                    counterPerfect++;
                }
            }
        }
        return counterPerfect;
    }

    public static void main(String[] args) {
        System.out.println(
                "Result: " + countSquarePairs(new int[]{9, 0, 2, -5, 7})
        );
        System.out.println(
                "Result: " + countSquarePairs(new int[]{9})
        );
        System.out.println(
                "Result: " + countSquarePairs(new int[]{11, 5, 4, 20})
        );
        System.out.println(
                "Result: " + countSquarePairs(new int[]{2, 7, 2, 2})
        );
    }
}
