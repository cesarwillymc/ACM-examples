/**
 * Created by cesarwillymamanicanaza on 26/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class PerfectNumber {

    static int getSumFactor(int number) {
        int sumFactor = 0;
        for (int index = 1; index <= (number / 2); index++) {
            if (number % index == 0)
                sumFactor += index;
        }
        return sumFactor;
    }

    static int henry(int i, int j) {
        int[] arrayPerfect = new int[Math.max(i, j)];
        int listPerfectNumber = 0;
        for (int index = 6; listPerfectNumber < Math.max(i, j); index++) {
            int factor = getSumFactor(index);
            if (factor == index) {
                System.out.println(factor + " and "+ index);
                arrayPerfect[listPerfectNumber] = index;
                listPerfectNumber++;
            }
        }
        return arrayPerfect[i - 1] + arrayPerfect[j - 1];
    }

    public static void main(String[] args) {
        System.out.println("Result: " + henry(1, 3));
    }
}
