/**
 * Created by cesarwillymamanicanaza on 30/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class RailroadTie {
    static int isRailroadTie(int[] a) {
        if (a.length < 2) return 0;
        int isSuccess = 1;
        for (int index = 0; index < a.length; index++) {
            int previousIndex = index - 1;
            int nextIndex = index + 1;
            if (a[index] == 0) {
                if (previousIndex < 0 || nextIndex >= a.length) {
                    isSuccess = 0;
                    break;
                }
                if (a[previousIndex] == 0 || a[nextIndex] == 0) {
                    isSuccess = 0;
                    break;
                }
            } else {
                if (previousIndex < 0) {
                    continue;
                }
                if (nextIndex >= a.length) {
                    continue;
                }
                boolean previousIsZero = a[previousIndex] == 0;
                if (previousIsZero == (a[nextIndex] == 0)) {
                    isSuccess = 0;
                    break;
                }
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3,}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1}));
        System.out.println(isRailroadTie(new int[]{}));
        System.out.println(isRailroadTie(new int[]{0}));
    }
}
