/**
 * Created by cesarwillymamanicanaza on 26/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsSquare {
    static int isSquare(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        int isSuccess = 0;
        for (int index = 1; index <= n / 2; index++) {
            if (n % index == 0) {
                if (index * index == n) {
                    isSuccess = 1;
                    break;
                }
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isSquare(4));
        System.out.println("Result: " + isSquare(25));
        System.out.println("Result: " + isSquare(-4));
        System.out.println("Result: " + isSquare(8));
        System.out.println("Result: " + isSquare(0));
    }
}
