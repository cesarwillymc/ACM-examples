import java.util.HashSet;

/**
 * Created by cesarwillymamanicanaza on 27/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class Isolated {
    static int isIsolated(long n){
        if(n>2097151||n<1) return -1;
        HashSet<Long> numbers = new HashSet<>();
        int isSuccess = 1;
        long square = n*n;
        long cube = n*n*n;
        do {
            numbers.add(square%10);
            square /=10;
        }while (square>=10);
        do {
            if (numbers.contains(cube%10)){
                isSuccess = 0;
                break;
            }

            cube /=10;
        }while (cube>=10);
        return isSuccess;
    }
    public static void main(String[] args) {
        System.out.println("Result: "+ isIsolated(69));
        System.out.println("Result: "+ isIsolated(162));
        System.out.println("Result: "+ isIsolated(2));
        System.out.println("Result: "+ isIsolated(3));
        System.out.println("Result: "+ isIsolated(8));
        System.out.println("Result: "+ isIsolated(9));
        System.out.println("Result: "+ isIsolated(14));
        System.out.println("Result: "+ isIsolated(24));
        System.out.println("Result: "+ isIsolated(28));
        System.out.println("Result: "+ isIsolated(34));
        System.out.println("Result: "+ isIsolated(58));
        System.out.println("Result: "+ isIsolated(63));
        System.out.println("Result: "+ isIsolated(2097152));
        System.out.println("Result: "+ isIsolated(-34));
        System.out.println("Result: "+ isIsolated(163));
        System.out.println("Result: "+ isIsolated(164));
        System.out.println("Result: "+ isIsolated(165));
    }
}
