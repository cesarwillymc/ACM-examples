/**
 * Created by cesarwillymamanicanaza on 1/08/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class ExamThree {
    static int isPrimeHappy(int n) {
        if (n < 3) return 0;
        int primeSum = 0;
        for (int prime = 2; prime < n; prime++) {
            boolean isPrime = true;
            for (int indexPrime = 2; indexPrime <= prime / 2; indexPrime++) {
                if (prime % indexPrime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeSum += prime;
            }
        }
        return primeSum % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(3));
    }
}
