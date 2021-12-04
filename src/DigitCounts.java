import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * DIGIT COUNTS
 *
 * @author Willy
 * Created 3/12/2021 at 20:18
 * INPUT:
 *      1 9
 *      12 321
 *      5987 6123
 *      12345678 12345679
 *      0 0
 * OUTPUT:
 *      0 1 1 1 1 1 1 1 1 1
 *      61 169 163 83 61 61 61 61 61 61
 *      134 58 28 24 23 36 147 24 27 47
 *      0 2 2 2 2 2 2 2 1 1
 */
public class DigitCounts {
    private static final String ZERO = "0";
    private static final String SPACE = " ";
    private static final int MIN = 1;
    private static final int MAX = 100000000;
    private static final int DIGIT_MIN = 0;
    private static final int DIGIT_MAX = 9;
    private static final String MESSAGE_ERROR = "Este data no es correcto, no se guardo.";

    public static void main(String[] args) {
        //Declare variable for enter text by keyboard
        Scanner sc = new Scanner(System.in);

        //Inicialize result
        ArrayList<HashMap<String, Integer>> results = new  ArrayList<>();

        boolean infiniteWhile = true;
        do {
            String word = sc.nextLine();
            if (finishedGame(word)) {
                infiniteWhile = false;
            } else {
                if (isCorrectUseCase(word)) {
                    results.add(getResultGame(word));
                } else {
                    System.out.println(MESSAGE_ERROR);
                }
            }
        } while (infiniteWhile);

        for (HashMap<String, Integer> result: results){
            System.out.println(orderText(result));
        }
    }

    private static StringBuilder orderText(HashMap<String, Integer> hashMap){
        StringBuilder result= new StringBuilder();
        for (int digit = DIGIT_MIN; digit <= DIGIT_MAX; digit++){
            result.append(hashMap.getOrDefault(String.valueOf(digit), DIGIT_MIN).toString()).append(" ");
        }
        return result;
    }

    private static HashMap<String, Integer> getResultGame(String lineGame){
        String[] listResult = lineGame.split(SPACE);
        HashMap<String, Integer> resultGame = new HashMap<>();
        for (int digit = Integer.parseInt(listResult[0]); digit <= Integer.parseInt(listResult[1]); digit++)
        {
           for(char value :String.valueOf(digit).toCharArray()){
               resultGame.put(String.valueOf(value),resultGame.getOrDefault(String.valueOf(value),0) + MIN);
           }
        }
        return resultGame;
    }


    private static boolean isCorrectUseCase(String words) {
        String[] result = words.trim().split(SPACE);
        return MIN <= Integer.parseInt(result[0]) && Integer.parseInt(result[0]) <= Integer.parseInt(result[1]) && Integer.parseInt(result[1]) <= MAX;
    }

    private static boolean finishedGame(String word) {
        return Arrays.stream(word.split(SPACE)).allMatch(it -> it.equals(ZERO));
    }

}
