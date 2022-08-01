import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cesarwillymamanicanaza on 31/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class FilterArray {
    static int[] filterArray(int[] a, int n) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int index = 0; n != 0; index++) {
            if (index >= a.length) {
                indices = null;
                break;
            }
            if (n % 2 == 1) {
                indices.add(index);
            }
            n /= 2;
        }
        if(indices != null){
            int[] response = new int[indices.size()];
            for (int index = 0; index < indices.size(); index++) {
                response[index] = a[indices.get(index)];
            }
            return response;
        }else{
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0)));

        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9,5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9,12,18,-6}, 11)));
    }


}
