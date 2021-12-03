import java.util.Scanner;


/**
 * Flowers flourist fron France
 * 01/12/2021
 *
 * input: San Sebastian se suciedad sin saco.
 *        Judas jode mucho
 *        Ana anillo a antonio a alturas
 *
 *
 * output: Y N Y
 */

public class Tautograms {
    static String valuePositive = "Y\n";
    static String valueNegative = "N\n";

    public static void main(String[] args) {
        //Declare variable for enter text by keyboard
        Scanner sc = new Scanner(System.in);

        //Inicialize list words
        StringBuilder result = new StringBuilder();
        String sentence;
        //Writer
        boolean whileInfinite = true;
        do {
            sentence = sc.nextLine();
            if (isLastLine(sentence)) {
                whileInfinite = false;
            } else {
                if (isLetterNotMore50Words(sentence) && isSentenceHaveSpace(sentence)) {
                    result.append(validateSentence(sentence));
                } else {
                    result.append(valueNegative);
                }
            }

        } while (whileInfinite);

        System.out.println(result);

    }

    public static String validateSentence(String sentence) {
        String[] words = sentence.split(" ");
        boolean isCorrect = false;
        String temporal = "";
        for (String word : words) {
            String firstLetter = String.valueOf(word.toCharArray()[0]);
            if (temporal.isEmpty()) {
                temporal = firstLetter;
            }
            if (temporal.equals(firstLetter)) {
                isCorrect = true;
            } else {
                isCorrect = false;
                break;
            }
        }
        return isCorrect ? valuePositive : valueNegative;
    }

    public static boolean isLetterNotMore50Words(String sentence) {
        return sentence.length() < 50;
    }

    public static boolean isSentenceHaveSpace(String sentence) {
        return sentence.split(" ").length >= 2;
    }

    public static boolean isLastLine(String phrases) {
        return phrases.trim().equals("*");
    }
}

