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
public class MaharishiTwo {
    static ArrayList<List<Integer>> dataTest = new ArrayList<>(
            Arrays.asList(
                    Collections.singletonList(
                            1
                    ), Arrays.asList(
                            1, 2
                    ), Arrays.asList(
                            1, 2, 3
                    ), Arrays.asList(
                            1, 2, 3, 4
                    ), Arrays.asList(
                            3, 3, 4, 4
                    ), Arrays.asList(
                            3, 2, 3, 4
                    ), Arrays.asList(
                            4, 1, 2, 3
                    ), Arrays.asList(
                            1, 1
                    ),
                    Collections.emptyList()
            )

    );

    static int onProcessInformation(List<Integer> data) {
        int y = 0;
        int x = 0;
        for (int index = 0; index < data.size(); index++) {
            int currentValue = data.get(index);
            if (currentValue % 2 == 0)
                y += currentValue;
            else x += currentValue;
        }
        return x - y;
    }

    public static void main(String[] args) {
        for (int index = 0; index < dataTest.size(); index++) {
            System.out.println(
                    "List N " + index + ": " + onProcessInformation(dataTest.get(index))
            );
        }

    }
}
