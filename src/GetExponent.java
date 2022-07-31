/**
 * Created by cesarwillymamanicanaza on 30/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class GetExponent {
    static int getExponent(int n, int p) {
        if (p <= 1) return -1;
        int counterExponent = 0;
        int currentNumber = (n < 0) ? -1 * n : n;
        do {
            if (currentNumber % p == 0)
                counterExponent++;
            else break;
            currentNumber /= p;
        } while (currentNumber > 0);
        return counterExponent;
    }

    public static void main(String[] args) {
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));
    }
}
