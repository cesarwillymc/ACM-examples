import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Willy on 17/07/2022.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
/** I dont know **/
public class MaharishiFive {
    static ArrayList<int[]> dataTest = new ArrayList<>(
            Arrays.asList(
                    new int[]{1, 8, 3, 2},
                    new int[]{1, 8, 3, 2, 6},
                    new int[]{1, 3, 7, 9},
                    new int[]{1, 2},
                    new int[]{},
                    new int[]{1, 2},
                    new int[]{1, 2}, null, null
            )
    );
    static ArrayList<int[]> dataTest2 = new ArrayList<>(
            Arrays.asList(
                    new int[]{4, 2, 6, 1},
                    new int[]{2, 6, 1},
                    new int[]{7, 1, 9, 3},
                    new int[]{3, 4},
                    new int[]{1, 2, 3},
                    new int[]{}, null,
                    new int[]{}, null
            )
    );

    static int[] onConvertListTo(List<Integer> data) {
        int[] temp = new int[data.size()];
        for (int index = 0; index < data.size(); index++) {
            temp[index] = data.get(index);
        }
        return temp;
    }

    static int[] f(int[] first, int[] second) {
        if (first == null || second == null) return null;
        HashMap<Integer, Integer> inCommon = new HashMap<>();

        for (int i : second) {
            inCommon.put(i, inCommon.getOrDefault(i, 0) + 1);
        }
        List<Integer> arrayInt = new ArrayList<>();

        for (int i : first) {
            if (inCommon.get(i) != null) arrayInt.add(i);
        }
        return onConvertListTo(arrayInt);
    }
    static int[] a5(int[] first, int[] second)
    {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[0];
        int min =
                (first.length < second.length) ? first.length : second.length;
        int[] a, b;
        if (min == first.length)
        {
            a = first;
            b = second;
        }
        else
        {
            a = second;
            b = first;
        }
        int[] c = new int[min];
        int k = 0;
        for (int value : a)
            for (int i : b)
                if (value == i) {
                    c[k] = value;
                    k++;
                }
        int[] retArray = new int[k];
        System.arraycopy(c, 0, retArray, 0, retArray.length);
        return retArray;
    }

    public static void main(String[] args) {
        for (int index = 0; index < dataTest.size(); index++)
            System.out.println(
                    "Number result " + index + " : " + Arrays.toString(a5(dataTest.get(index), dataTest2.get(index)))
            );
    }
}
