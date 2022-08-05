/**
 * Created by cesarwillymamanicanaza on 1/08/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class SecondExam {
    static int closestFibonacci(int n) {
        if (n < 1) return 0;
        int next = 1;
        int current = 0;
        int temp;
        while (next <= n) {
            temp = current;
            current = next;
            next += temp;
        }
        return current;
    }

    public static void main(String[] args) {
        closestFibonacci(12);
        closestFibonacci(33);
        closestFibonacci(34);
        closestFibonacci(1);
        closestFibonacci(-1);
    }
}
