/**
 * Created by cesarwillymamanicanaza on 29/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class MinMaxDisjoint {
    static int isMinMaxDisjoint(int[] a) {
        if (a.length <= 2) return 0;
        int isSuccess = 1;
        int minValueIndex = 0;
        int maxValueIndex = 0;
        for (int index = 1; index < a.length; index++) {
            if (a[index] == a[minValueIndex] || a[index] == a[maxValueIndex]) {
                isSuccess = 0;
                break;
            }
            if (a[index] < a[minValueIndex]) {
                minValueIndex = index;
            }
            if (a[index] > a[maxValueIndex]) {
                maxValueIndex = index;
            }
        }
        int indexDifferent = minValueIndex - maxValueIndex;
        if (indexDifferent == -1 || indexDifferent == 1)
            isSuccess = 0;
        return isSuccess;
    }

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));

        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));

        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));

        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));

        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }
}
