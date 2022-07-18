import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Willy on 17/07/2022.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class MaharishiFour {

    static ArrayList<Integer> dataTest = new ArrayList<>(
            Arrays.asList(
                    1234, 12005, 1, 1000, 0, -12345
            )

    );

    static String onProcessData(int n) {
        if (n < 10) return String.valueOf(n);
        return String.valueOf(n % 10) + onProcessData(n / 10);
    }

    static int f(int n) {
        boolean isNegative = n < 0;
        int result = Integer.parseInt(onProcessData(isNegative ? n * -1 : n));
        return isNegative ? -1 * result : result;
    }

    public static void main(String[] args) {
        for (int index = 0; index < dataTest.size(); index++)
            System.out.println(
                    "Number result " + index + " : " + f(dataTest.get(index))
            );
    }
}
