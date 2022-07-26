/**
 * Created by cesarwillymamanicanaza on 22/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class PorcupineNumber {
    static boolean isPrime(int n) {
        if (n < 1) return false;
        boolean isPrime = true;
        for (int index = 2; index <= n / 2; index++) {
            if (n % index == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    static boolean lastNumberIsNine(int n){
        return n%10 == 9;
    }
    static int findPorcupineNumber(int n) {
        boolean findFistPorcupineNumber=false;
        int fistPorcupineNumber=0;
        for (int index = n + 1; true; index++) {
            if(isPrime(index)){
                if (findFistPorcupineNumber){
                    if(lastNumberIsNine(index)){
                        break;
                    }else {
                        findFistPorcupineNumber=false;
                    }
                }else if (lastNumberIsNine(index)){
                    fistPorcupineNumber=index;
                    findFistPorcupineNumber = true;
                }
            }
        }
        return fistPorcupineNumber;
    }

    public static void main(String[] args) {
        System.out.println("result: " + findPorcupineNumber(0));

        System.out.println("result: " + findPorcupineNumber(138));

        System.out.println("result: " + findPorcupineNumber(139));
    }
}
