/**
 * Created by cesarwillymamanicanaza on 25/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class RepsEqual {
    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    static int repsEqual(int[] a, int n) {
        int isSucess = 1;
        int currentN = n;
        for (int index = a.length - 1; index >= 0; index--) {

            if (a[index] != currentN%10) {
                isSucess = 0;
                break;
            }
            currentN = currentN / 10;
        }
        return isSucess;
    }

    public static void main(String[] args) {
        System.out.println(
                "Result: " + repsEqual(new int[]{3, 2, 0, 5, 3}, 32053)
        );
        System.out.println(
                "Result: " + repsEqual(new int[]{3, 2, 0, 5}, 32053)
        );
        System.out.println(
                "Result: " + repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053)
        );
        System.out.println(
                "Result: " + repsEqual(new int[]{2, 3, 0, 5, 3}, 32053)
        );
        System.out.println(
                "Result: " + repsEqual(new int[]{9, 3, 1, 1, 2}, 32053)
        );
        System.out.println(
                "Result: " + repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053)
        );
        System.out.println(
                "Result: " + repsEqual(new int[]{0,0,0,0, 3, 2, 0, 5, 3}, 32053)
        );
    }
}
