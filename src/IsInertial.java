/**
 * Created by cesarwillymamanicanaza on 22/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsInertial {
    static int isInertial(int[] a) {
        if (a.length == 1) return 0;
        int maximumValue = -99999999;
        int maximumEvenValue = -99999999;
        int minimumOdd = 99999990;

        for (int currentValue : a) {
            if (currentValue > maximumValue) {
                if (maximumValue % 2 == 0) {
                    maximumEvenValue = maximumValue;
                }

                maximumValue = currentValue;
            } else if (currentValue > maximumEvenValue && currentValue % 2 == 0 && maximumValue != currentValue) {
                maximumEvenValue = currentValue;
            }
            if (minimumOdd > currentValue && currentValue % 2 != 0) {
                minimumOdd = currentValue;
            }

        }
        return maximumValue % 2 == 0 && maximumEvenValue < minimumOdd && minimumOdd % 2 != 0 ? 1 : 0;
    }


    public static void main(String[] args) {

        System.out.println(
                "Result: " + isInertial(new int[]{1})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{1, 2, 3, 4})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{1, 1, 1, 1, 1, 1, 2})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 12, 4, 6, 8, 11})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 12, 12, 4, 6, 8, 11})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{-2, -4, -6, -8, -11})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 3, 5, 7})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 4, 6, 8, 10})
        );

    }
    /*
     System.out.println(
                "Result: " + isInertial(new int[]{1})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{1, 2, 3, 4})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{1, 1, 1, 1, 1, 1, 2})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 12, 4, 6, 8, 11})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 12, 12, 4, 6, 8, 11})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{-2, -4, -6, -8, -11})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 3, 5, 7})
        );
        System.out.println(
                "Result: " + isInertial(new int[]{2, 4, 6, 8, 10})
        );
     */
}
