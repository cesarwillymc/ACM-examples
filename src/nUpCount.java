import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Created by cesarwillymamanicanaza on 21/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 * @since 1 to 10
 */

public class nUpCount{
    /**
     * @since until n and a
     * @param a is an array
     * @param n is an integer
     * @return an integer
     */
    static int nUpCount(int[] a, int n){
        int nUpCount = 0;
        int partialSum = 0;
        int previousPartialSum;
        for (int j : a) {
            previousPartialSum = partialSum;
            partialSum += j;
            if (previousPartialSum <= n && partialSum > n) {
                nUpCount++;
            }
        }
        return nUpCount;
    }

    public static void main(String[] args){
        int result = nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5);
        System.out.println(result);
        result = nUpCount(new int[]{6, 3, 1}, 6);
        System.out.println(result);
        result = nUpCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 20);
        System.out.println(result);
        float x = 2.34561f;
        float y = 5.41931f;
        double x1 = 2.34561;
        double y1 = 5.41931;

        System.out.println(x*y);
        System.out.println(x1*y1);
        double a =0.7;
        double b =0.9;
        double r1 = a+0.1;
        double r2 = b-0.1;
        System.out.println(r1 );
        System.out.println(r2);
        System.out.println(r1 ==r2);

        Scanner sc= new Scanner(System.in);
        System.out.print("Type your name: ");
        System.out.println("you wrote: "+ sc.nextLine());
        String input= JOptionPane.showInputDialog("Quien ama a Hirayda");
        System.out.println(input);
        JOptionPane.showMessageDialog(null,"Claroo!! "+ input +" quiere mucho a Hirayda <3");
    }


}