import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cesarwillymamanicanaza on 29/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class ClusterCompression {
    static int[] clusterCompression(int[] a) {
        if (a.length == 0) return new int[]{};
        ArrayList<Integer> clusters = new ArrayList<>();
        int previous = a[0];
        clusters.add(a[0]);

        for (int index = 1; index < a.length; index++) {
            if (a[index] != previous) {
                clusters.add(a[index]);
                previous = a[index];
            }
        }
        int[] result = new int[clusters.size()];
        for (int index = 0; index < clusters.size(); index++) {
            result[index] = clusters.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }
}
