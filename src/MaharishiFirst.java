import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Willy on 16/07/2022.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class MaharishiFirst {
    private static final int FAIL = 0;
    private static final int SUCCESS = 1;

    static ArrayList<List<Integer>> dataTest = new ArrayList<>(
            Arrays.asList(
                    Arrays.asList(
                            1, 2, 3, 4, 5
                    ), Arrays.asList(
                            3, 2, 1, 4, 5
                    ), Arrays.asList(
                            3, 2, 1, 4, 1
                    ), Arrays.asList(
                            1, 2, 3, 4
                    ), Collections.emptyList(),
                    Collections.singletonList(
                            10
                    )
            )

    );

    public static int onProcessInformation(List<Integer> test) {
        if (test.size() == 0 || test.size() % 2 == 0) return FAIL;
        if (test.size() == 1) return SUCCESS;
        int itemMiddle = test.get(test.size() / 2);
        boolean leftIsListMajorThan = isListMajorThan(
                test.subList(0, (test.size() / 2) - 1),
                itemMiddle
        );
        boolean rightIsListMajorThan = isListMajorThan(
                test.subList((test.size() / 2) + 1, test.size()),
                itemMiddle);

        if (leftIsListMajorThan && rightIsListMajorThan) {
            return SUCCESS;
        } else {
            return FAIL;
        }
    }

    public static boolean isListMajorThan(List<Integer> test, int number) {
        boolean isListLessThan = true;
        for (int index = 0; index < test.size(); index++) {
            isListLessThan = number < test.get(index);
            if (!isListLessThan) break;
        }
        return isListLessThan;
    }

    public static void main(String[] args) {
        for (int index = 0; index < dataTest.size(); index++) {
            System.out.println(
                    "List N " + index + ": " + onProcessInformation(dataTest.get(index))
            );
        }

    }

}
