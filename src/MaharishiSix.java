import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Willy on 17/07/2022.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class MaharishiSix {
    static int UNSUCCESS = -1;

    static ArrayList<int[]> dataTest = new ArrayList<>(
            Arrays.asList(
                    new int[]{
                            1, 8, 3, 7, 10, 2
                    }, new int[]{
                            1, 5, 3, 1, 1, 1, 1, 1, 1
                    }, new int[]{
                            2, 1, 1, 1, 2, 1, 7
                    }, new int[]{
                            1, 2, 3
                    }, new int[]{
                            3, 4, 5, 10
                    }, new int[]{
                            1, 2, 10, 3, 4
                    }
            )

    );

    static int f(int[] a) {
        int breakPoint=-1;
        int sumA = 0, sumB = 0;
        for (int index = 0, lastIndex = a.length - 1; true; ) {
            if(index == lastIndex ) {
                if (sumA == sumB)
                    breakPoint= index;

                break;
            }
            if (sumA == 0 || sumA <= sumB)
            {
                sumA += a[index];
                index++;
            }
            if(index == lastIndex ) {
                if (sumA == sumB)
                    breakPoint= index;
                break;
            }
            if (sumB == 0 || sumA >= sumB){
                sumB += a[lastIndex];
                lastIndex--;
            }

        }
        System.out.println( "*****************t " +sumA+" and  " +sumB);
        return breakPoint;
    }

    public static void main(String[] args) {

        for (int index = 0; index < dataTest.size(); index++)
            System.out.println(
                    "Number result " + index + " : " + f(dataTest.get(index))
            );

    }
}
