/**
 * Created by cesarwillymamanicanaza on 27/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class Futhermore {
    static int matches(int[] a, int[] p) {
        int sumArray = 0;
        int isSuccess = 1;
        for (int i : p) {
            if (isSuccess == 0) break;
            boolean isLessThan0 = i < 0;
            for (int secondIndex = 0; isLessThan0 ? (secondIndex > i) : (secondIndex < i); sumArray++) {
                if (isLessThan0) {
                    if (a[sumArray] > 0) {
                        isSuccess = 0;
                        break;
                    }
                } else {
                    if (a[sumArray] < 0) {
                        isSuccess = 0;
                        break;
                    }
                }
                if (isLessThan0) secondIndex--;
                else secondIndex++;
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {


        System.out.println(
                "Result: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3})
        );
        System.out.println(
                "Result: " + matches(new int[]{1, 2, 3, 5, -5, 2, 3, 18}, new int[]{4, -1, 3})
        );
        System.out.println(
                "Result: " + matches(new int[]{1, 2, 3, 5, 5, 2, -3, -18}, new int[]{6, -1, -1})
        );
        System.out.println(
                "Result: " + matches(new int[]{-1, -2, -3, -5, -5, -2, 3, 18}, new int[]{6, -1, -1})
        );
        System.out.println(
                "Result: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3})
        );
        System.out.println(
                "Result: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3})
        );
        System.out.println(
                "Result: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8})
        );
        System.out.println(
                "Result: " + matches(new int[]{1, 2, 3, 1, 5, 2, 3, 18}, new int[]{8})
        );
        System.out.println(
                "Result: " + matches(new int[]{-1, -2, -3, -1, -5, -2, -3, -18}, new int[]{-8})
        );
     /*

      */
    }
}
