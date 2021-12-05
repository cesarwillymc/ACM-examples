import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * NameExercise
 *
 * @author Willy
 * Created 4/12/2021 at 21:05
 */
public class BigMod {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 1;
    private static final int LIMIT = 2147483647;
    private static final int LIMIT_3 = 46340;
    private static final String MESSAGE_ERROR = "Este data no es correcto, no se guardo.";

    // Function to compute num (mod a)
    static int mod(int b, int p, int m) {
        if (p == 0) {
            return ONE;
        }
        if (p % 2 == 0) {
            int value = mod(b, p / 2, m);
            return (value * value) % m;
        } else if (p % 2 == 1) {
            int x, y;
            x = b % m;
            y = mod(b, p - 1, m);
            return (x * y) % m;
        }
        return ZERO;
    }

    public static void main(String[] args) {
        //Declare variable for enter text by keyboard
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < 3; ) {
            int number = sc.nextInt();
            if (isCorrectUseCase(number, index)) {
                numbers.add(number);
                index++;
            } else {
                System.out.println(MESSAGE_ERROR);
            }
        }
        System.out.println(mod(numbers.get(0),numbers.get(1),numbers.get(2)));
    }

    private static boolean isCorrectUseCase(int number, int index) {
        if (index == TWO) {
            return ONE <= number && number < LIMIT_3;
        } else {
            return ZERO <= number && number < LIMIT;
        }
    }

}
