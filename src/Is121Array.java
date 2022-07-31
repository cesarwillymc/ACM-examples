import java.util.HashMap;

/**
 * Created by cesarwillymamanicanaza on 30/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class Is121Array {
    static int is121Array(int[] a) {
        if (a.length < 3) return 0;
        int first1Counter = -1;
        int first2Counter = -1;
        int second1Counter = -1;
        int previous = -1;
        int isSuccess = 1;
        for (int i : a) {
            if (i != 1 && i != 2) {
                isSuccess = 0;
                break;
            }
            if (previous == -1) {
                previous = i;
                first1Counter = 1;
            } else {
                if (previous != i) {
                    if(first1Counter != -1 && second1Counter !=-1 && first2Counter!=-1 ){
                        isSuccess = 0;
                        break;
                    }else if(first1Counter != -1 && second1Counter == -1){
                        second1Counter = 1;
                    }else if(first1Counter != -1){
                        first2Counter = 1;
                    }
                    previous = i;
                } else {
                    if(first1Counter != -1 && second1Counter == -1){
                        first1Counter++;
                    }else if(first1Counter != -1 && first2Counter == -1){
                        second1Counter++;
                    }else if(first1Counter != -1){
                        first2Counter++;
                    }
                }
            }


        }
        return isSuccess == 0 ? isSuccess : first1Counter == first2Counter ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }
}
