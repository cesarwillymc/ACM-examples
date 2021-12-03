import java.util.*;

/**
 * Head or Tail
 * 02/12/2021
 *
 * input: 5
 *        0 0 0 1 1
 * output: John gano 2 y Mary gano 3
 */
public class HeadorTail {

    private static final int MIN = 1;
    private static final int MAX = 10000;
    private static final String FINISHED = "0";
    private static final String MESSAGE_ERROR_LIST = "Error no cuenta este juego";
    private static final String SPACE = " ";
    private static final String KEY_MARY = "Mary";
    private static final String KEY_JOHN = "John";
    private static final String POINT_MARY = "0";
    private static final String POINT_JOHN = "1";

    public static void main(String[] args) {

        //Declare variable for enter text by keyboard
        Scanner sc = new Scanner(System.in);

        //Inicialize list words
        ArrayList<HashMap<String, Integer>> results = new  ArrayList<>();
        //Add values by default

        boolean infiniteWhile = true;
        do {
            String word = sc.nextLine();
            if (finishedGame(word)) {
                infiniteWhile = false;
            } else {
                if (isValidNumberGames(word)) {
                    String listResult = sc.nextLine();
                    if (isValidListResult(listResult, Integer.parseInt(word))) {
                        results.add(getResultGame(listResult));
                    } else {
                        System.out.println(MESSAGE_ERROR_LIST);
                    }
                }
            }
        } while (infiniteWhile);

        for (HashMap<String, Integer> result: results){
            printMessageResult(result);
        }

    }
    private static void printMessageResult(HashMap<String, Integer> result){
        System.out.println("Mary won "+ result.getOrDefault(KEY_MARY,0).toString() + " times and John won "+result.getOrDefault(KEY_JOHN,0).toString()+" times.");
    }
    private static HashMap<String, Integer> getResultGame(String lineGame){
        String[] listResult = lineGame.split(SPACE);
        HashMap<String, Integer> resultGame = new HashMap<>();
        for (String result:listResult){
            if(result.contains(POINT_JOHN)){
                resultGame.put(KEY_JOHN,resultGame.getOrDefault(KEY_JOHN,0) + 1);
            }else if(result.contains(POINT_MARY)){
                resultGame.put(KEY_MARY,resultGame.getOrDefault(KEY_MARY,0) + 1);
            }
        }
        return resultGame;
    }

    private static boolean isValidListResult(String lineResponse, int range) {
        String[] listResult = lineResponse.split(SPACE);
        return listResult.length == range;
    }

    private static boolean isValidNumberGames(String word) {
        try {
            int number = Integer.parseInt(word);
            return number <= MAX && MIN <= number;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean finishedGame(String word) {
        return word.trim().equals(FINISHED);
    }
}
