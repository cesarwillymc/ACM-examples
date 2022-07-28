/**
 * Created by cesarwillymamanicanaza on 27/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsStakedNumber {
    static int isStacked(int n) {
        int isSuccess = 0;
        for (int index = 1; true; index++) {
            int stackedNumber = index * (index + 1) / 2;
            if (stackedNumber == n) {
                isSuccess = 1;
                break;
            }
            if (stackedNumber > n) {
                break;
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isStacked(10));
        System.out.println("Result: " + isStacked(7));
        System.out.println("Result: " + isStacked(4));
        System.out.println("Result: " + isStacked(6));

    }
}
