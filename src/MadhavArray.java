/**
 * Created by cesarwillymamanicanaza on 21/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class MadhavArray {

    static int getIndexN(int size) {
        int n = 0;
        for (int index = (size / 2) + 1; index >= 0; index--) {
            if (size == ((index * (index + 1)) / 2)) {
                n = index;
                break;
            }
        }
        return n;
    }

    static int getSumByRange(int start, int end, int[] a) {
        int sum = 0;
        for (int index = start; index < (end+start); index++) {
            sum += a[index];
        }
        return sum;
    }

    static int isMadhavArray(int[] a) {
        int n = getIndexN(a.length);
        if (n == 0) return 0;
        System.out.println(n);
        int valueEquals = a[0];
        int stateMadhav = 1;
        int previousStart = 0;
        for (int index = 1; index <= n; index++) {
            if (valueEquals != getSumByRange(previousStart, index, a)) {
                stateMadhav = 0;
                break;
            }
            previousStart += index;
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
//
        System.out.println(
                "Result: " + isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1})
        );
        System.out.println(
                "Result: " + isMadhavArray(new int[]{3, 1, 2, 3, 0})
        );
     */
}
