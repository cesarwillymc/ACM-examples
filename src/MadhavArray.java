/**
 * Created by cesarwillymamanicanaza on 21/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class MadhavArray {

    static int getSumByRange(int start, int end, int[] a) {
        int sum = 0;
        for (int index = start; index < end; index++) {
            sum += a[index];
        }
        return sum;
    }

    static int isMadhavArray(int[] a) {
        if (a.length == 0) return 0;
        int valueEquals = a[0];
        int stateMadhav = 1;
        int currentCounter = 1;
        int previusIndex = 0;
        for (int index = 1; index <= a.length; ) {
            if (valueEquals != getSumByRange(previusIndex, index, a)) {
                stateMadhav = 0;
                break;
            }
            currentCounter++;
            previusIndex = index;
            index = currentCounter * (currentCounter + 1) / 2;

            if (index > a.length && previusIndex != a.length) {
                stateMadhav = 0;
                break;
            }
        }
        return stateMadhav;
    }

    public static void main(String[] args) {

        System.out.println(
                "Result: " + isMadhavArray(new int[]{2, 1, 1})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{2, 1, 1, 4, -1, -1})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{18, 9, 10, 6, 6, 6})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{3, 1, 2, 3, 0})
        );

        System.out.println(
                "Result: " + isMadhavArray(new int[]{})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{1})
        );

    }
    /*
      System.out.println(
                "Result: " + isMadhavArray(new int[]{2, 1, 1})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{2, 1, 1, 4, -1, -1})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{18, 9, 10, 6, 6, 6})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{3, 1, 2, 3, 0})
        );

        System.out.println(
                "Result: " + isMadhavArray(new int[]{})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{1})
        );
     */
}
