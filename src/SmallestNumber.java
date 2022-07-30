/**
 * Created by cesarwillymamanicanaza on 29/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class SmallestNumber {
    static boolean contains2(int n) {
        boolean contains2 = false;
        int currentN = n;
        do {
            if (currentN % 10 == 2) {
                contains2 = true;
                break;
            }
            currentN /= 10;
        } while (currentN != 0);
        return contains2;
    }

    static int smallest(int n) {
        int numberSuccess = 0;
        for (int index = 2; numberSuccess == 0; index++) {
            if (contains2(index)) {
                boolean success = true;
                for (int counter = 2; counter <= n; counter++) {
                    if (!contains2(index * counter)) {
                        success = false;
                        break;
                    }
                }
                if (success)
                    numberSuccess = index;
            }
        }
        return numberSuccess;
    }

    public static void main(String[] args) {

        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }
}
