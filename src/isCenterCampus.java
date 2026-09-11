import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cesarwillymamanicanaza on 2/3/23.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class isCenterCampus {
    static ArrayList<List<Integer>> dataTest = new ArrayList<>(
            Arrays.asList(
                    Arrays.asList(
                            0, 4
                    ), Arrays.asList(
                            0, 3
                    ), Arrays.asList(
                            0, 2
                    ), Arrays.asList(
                            0, 1
                    ), Arrays.asList(
                            1, 3
                    ), Arrays.asList(
                            1, 2
                    ), Arrays.asList(
                            1, 1
                    ), Arrays.asList(2, 2)
                    , Arrays.asList(2, 1)
                    , Arrays.asList(3, 1)
                    , Arrays.asList(1, 0)
                    , Arrays.asList(-1, 2),
                    Arrays.asList(-1, -2),
                    Arrays.asList(0, 1)
            )

    );

    static int isCenter(int[] a) {
        if (a.length % 2 == 0) return 0;
        int isCenter = 1;
        int center = (a.length - 1) / 2;
        int initial = 0;
        int end = a.length - 1;
        for (; initial != center || end != center; initial++, end--) {
            if (a[initial] <= a[center]) {
                isCenter = 0;
                break;
            }
            if (a[end] <= a[center]) {
                isCenter = 0;
                break;
            }
        }
        return isCenter;
    }


    static int f(int[] a) {
        int x = 0;
        int y = 0;
        for (int value : a) {
            if (value % 2 == 0) {
                y += value;
            } else {
                x += value;
            }
        }
        return x - y;
    }

    static char[] f(char[] a, int start, int len) {
        if (start < 0 || len < 0) return null;
        if (a.length <= start + len - 1) return null;
        String result = "";
        int counter = start;
        int index = 0;
        for (; index < len; counter++, index++) {
            result = result + a[counter];
        }
        return result.toCharArray();
    }

    static int f(int n) {
        int sign = 1;
        if (n == 0) return 0;
        if (n < 0) {
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
    }

    static int a6(int[] a) {
        if (a.length < 3) return -1;
        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += a[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }

    public static void main(String[] args) {
        /**
         * first example test
         System.out.println(isCenter(new int[]{1,2,3,4,5}));
         System.out.println(isCenter(new int[]{3,2,1,4,5}));
         System.out.println(isCenter(new int[]{3,2,1,5,1}));
         System.out.println(isCenter(new int[]{1,2,3,4}));
         System.out.println(isCenter(new int[]{}));
         System.out.println(isCenter(new int[]{10}));
         */
        /**
         * Second example test
         *
         System.out.println(f(new int[]{1}));
         System.out.println(f(new int[]{1,2}));
         System.out.println(f(new int[]{1,2,3}));
         System.out.println(f(new int[]{1,2,3,4}));
         System.out.println(f(new int[]{3,3,4,4}));
         System.out.println(f(new int[]{3,2,3,4}));
         System.out.println(f(new int[]{4,1,2,3}));
         System.out.println(f(new int[]{1,1}));
         System.out.println(f(new int[]{}));
         */
        /**
         * tHIRD exercise
         for (int index = 0; index < dataTest.size(); index++) {
         System.out.println(
         "List N " + index + ": " + Arrays.toString(f(
         new char[]{'a', 'b', 'c'},
         dataTest.get(index).get(0),
         dataTest.get(index).get(1)))
         );
         }
         */
        /**
         * fourth
         *  System.out.println(f(-123422113));
         */
        System.out.println(a6(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println(a6(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println(a6(new int[]{2, 3, 1, 1, -2, 0, 7}));
        System.out.println(a6(new int[]{1, 2, 3}));
        System.out.println(a6(new int[]{3, 4, 5, 10}));
        System.out.println(a6(new int[]{1, 2, 10, 3, 4}));

    }

}
