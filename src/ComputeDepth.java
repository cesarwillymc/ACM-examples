import java.util.ArrayList;

/**
 * Created by cesarwillymamanicanaza on 27/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class ComputeDepth {
    static ArrayList<Integer> getNewNumbers(ArrayList<Integer> listNumber, int n) {
        if (n < 10) {
            if (!listNumber.contains(n)) {
                listNumber.add(n);
            }
            return listNumber;
        }
        int module10 = n % 10;
        if (!listNumber.contains(module10)) {
            listNumber.add(module10);
        }
        return getNewNumbers(listNumber, n / 10);
    }

    static int computeDepth(int n) {
        ArrayList<Integer> keepTrack = new ArrayList<>();
        int depth = 1;
        do {
            ArrayList<Integer> temp = getNewNumbers(keepTrack, n * depth);
            keepTrack = temp;
            depth++;
        } while (keepTrack.size() != 10);
        return depth - 1;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + computeDepth(7));
        System.out.println("Result: " + computeDepth(13));
        System.out.println("Result: " + computeDepth(25));
    }
}
