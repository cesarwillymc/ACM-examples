import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Willy on 17/07/2022.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class MaharishiThree {

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
                    Arrays.asList(0,1)
            )

    );

    static char[] getRangeCharList(char[] data, int start, int len) {
        if (start < 0 || len > data.length) return null;
        if ((data.length - start) < len) return null;
        char[] temp = new char[len];
        for (int index = start; index < len + start; index++) {
            temp[index - start] = data[index];
        }
        return temp;
    }

    static char[] onProcessInformation(char[] data, int start, int len) {
        try {
            return getRangeCharList(data, start, len);
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        for (int index = 0; index < dataTest.size(); index++) {
            System.out.println(
                    "List N " + index + ": " + Arrays.toString(onProcessInformation(
                            new char[]{'a', 'b', 'c'},
                            dataTest.get(index).get(0),
                            dataTest.get(index).get(1)))
            );
        }

    }
}
