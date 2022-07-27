/**
 * Created by cesarwillymamanicanaza on 26/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class ConvertToBase10 {
    static int isLegalNumber(int[] a, int base) {
        int isSuccess = 1;
        for (int index : a) {
            if (index >= base) {
                isSuccess = 0;
                break;
            }
        }
        return isSuccess;
    }

    static int convertToBase10(int[] a, int base) {
        if (isLegalNumber(a, base) == 0) return 0;
        int sum = 0;
        for (int index = a.length-1, counter =0; counter < a.length; index--, counter++) {
            sum += (a[index] * Math.pow(base, counter));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(
                "Result: " + convertToBase10(new int[]{1, 0, 1, 1}, 2)
        );
        System.out.println(
                "Result: " + convertToBase10(new int[]{1, 1, 2}, 3)
        );
        System.out.println(
                "Result: " + convertToBase10(new int[]{3, 2, 5}, 8)
        );
        System.out.println(
                "Result: " + convertToBase10(new int[]{3, 7, 1}, 6)
        );

    }
}
