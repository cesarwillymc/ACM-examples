/**
 * Created by cesarwillymamanicanaza on 28/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class CountRepresentations {

    static int countRepresentations(int numRupees) {
        int count = 0;
        for (int rupee20 = 0; rupee20 <= numRupees / 20; rupee20++)
            for (int rupee10 = 0; rupee10 <= numRupees / 10; rupee10++)
                for (int rupee5 = 0; rupee5 <= numRupees / 5; rupee5++)
                    for (int rupee2 = 0; rupee2 <= numRupees / 2; rupee2++)
                        for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
                            int sumRupees = rupee20*20 + rupee10*10 + rupee5*5 + rupee2*2 + rupee1;
                            if (sumRupees > numRupees) break;
                            if (sumRupees == numRupees) {
                                count++;
                            }
                        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countRepresentations(12));
    }
}
