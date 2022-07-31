import java.util.HashSet;

/**
 * Created by cesarwillymamanicanaza on 30/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsPacked {
    static int isPacked(int[] a) {
        if (a.length == 0) return 1;
        if (a[0] == 0) return 0;
        HashSet<Integer> registerNumber = new HashSet<>();
        int isSuccess = 1;
        int currentSelect = a[0];
        int counter = 1;
        registerNumber.add(a[0]);
        for (int index = 1; index < a.length; index++) {
            if (a[index] < 1) {
                isSuccess = 0;
                break;
            }
            if (currentSelect == a[index]) {
                if (counter < currentSelect) {
                    counter++;
                } else {
                    isSuccess = 0;
                    break;
                }
            } else {
                if (counter < currentSelect) {
                    isSuccess = 0;
                    break;
                } else {
                    if (registerNumber.contains(a[index])) {
                        isSuccess = 0;
                        break;
                    }
                    registerNumber.add(a[index]);
                    counter = 1;
                    currentSelect = a[index];
                }
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));

        System.out.println(isPacked(new int[]{2, 3, 2, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 3, 3, 3}));
    }
}
