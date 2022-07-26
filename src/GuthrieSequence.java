/**
 * Created by cesarwillymamanicanaza on 25/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class GuthrieSequence {
    /**
     * Rules
     **/
    static int isOdd(int n) {
        return n * 3 + 1;
    }

    static int isEven(int n) {
        return n / 2;
    }

    static int isGuthrieSequence(int[] a) {
        int isSuccess = 1;
        for (int index = 0; index < a.length-1 ; index++) {
            if (a[a.length - 1] != 1) {
                isSuccess = 0;
                break;
            }
            int value = a[index];
            int currentValue;
            if (value % 2 == 0) {
                currentValue = isEven(value);
            } else {
                currentValue = isOdd(value);
            }
            if (currentValue != a[index+1]) {
                isSuccess = 0;
                break;
            }

        }
        return isSuccess;
    }

    public static void main(String[] args) {
        System.out.println(
                "Result: " + isGuthrieSequence(new int[]{8, 4, 2, 1})
        );
        System.out.println(
                "Result: " + isGuthrieSequence(new int[]{8, 17, 4, 1})
        );
        System.out.println(
                "Result: " + isGuthrieSequence(new int[]{8, 4, 1})
        );
        System.out.println(
                "Result: " + isGuthrieSequence(new int[]{8, 4, 2})
        );
        System.out.println(
                "Result: " + isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1})
        );
    }
}
