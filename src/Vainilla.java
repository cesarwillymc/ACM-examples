/**
 * Created by cesarwillymamanicanaza on 28/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class Vainilla {

    static int isVanilla(int[] a) {
        if (a.length == 0) return 1;
        int isVanilla = 1;
        int firstDigit = a[0] % 10;
        for (int index : a) {
            int currentNumber = index < 0 ? -1 * index : index;
            do {
                if (firstDigit != currentNumber % 10) {
                    isVanilla = 0;
                    break;
                }
                currentNumber /= 10;
            } while (currentNumber != 0);
        }
        return isVanilla;
    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1, 111111}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }
}
