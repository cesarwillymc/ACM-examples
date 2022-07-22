/**
 * Created by cesarwillymamanicanaza on 21/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class PrimeCount {
    static boolean isPrime(int n) {
        if(n<=1) return false;
        boolean isPrime = true;
        for (int index = 2; index <= n / 2; index++) {
            if (n % index == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static int primeCount(int start, int end) {
        int counter = 0;
        for (int index = start <= 0 ? 2 : start; index <= end; index++) {
            if (isPrime(index)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(
                "Result: " + primeCount(10, 30)
        );
        System.out.println(
                "Result: " + primeCount(11, 29)
        );
        System.out.println(
                "Result: " + primeCount(20, 22)
        );
        System.out.println(
                "Result: " + primeCount(1, 1)
        );
        System.out.println(
                "Result: " + primeCount(5, 5)
        );
        System.out.println(
                "Result: " + primeCount(6, 2)
        );
        System.out.println(
                "Result: " + primeCount(-10, 6)
        );
    }
}
