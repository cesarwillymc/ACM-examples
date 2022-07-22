/**
 * Created by cesarwillymamanicanaza on 21/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class PerfectSquare {

    static boolean isPerfectNumber(int n) {
        int numberMultiple = (int) Math.pow(n, 0.5);
        return (numberMultiple * numberMultiple) == n;
    }

    static int isPerfectSquare(int n) {
        int nextSquare = ++n;
        do {
            if (isPerfectNumber(nextSquare)) {
                break;
            }
            nextSquare++;
        } while (true);
        return nextSquare;
    }

    static int otherResponse(int n) {
        int nextPerfectSquare = 0;
        if (n >= 0) {
            double sqrtResult = Math.sqrt(n);
            int baseNumber = (int) sqrtResult;
            int nextNumber = baseNumber + 1;
            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
        }
        return nextPerfectSquare;
    }

    public static void main(String[] args) {
        System.out.println(
                "result: " + isPerfectSquare(-5)
        );
    }
}
