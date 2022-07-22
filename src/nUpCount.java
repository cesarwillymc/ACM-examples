/**
 * Created by cesarwillymamanicanaza on 21/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class nUpCount{
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
    }


}