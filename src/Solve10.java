import java.util.Arrays;

/**
 * Created by cesarwillymamanicanaza on 25/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class Solve10 {
    static int factorial(int n) {
        if (n == 1) return 1;
        return n* factorial(n - 1) ;
    }
    static int[] solve10(){
        boolean existFactorial=false;
        int[] solve10 = new int[2];
        int factorial10 = factorial(10);
        for (int x =1; x <= 10;x++){
            solve10[0] = x;
            for (int y = x ; y <= 10; y++){
                solve10[1] = y;
                if(factorial(solve10[0]) + factorial(solve10[1]) == factorial10){
                    existFactorial =true;
                    break;
                }
            }
        }
        return  existFactorial?solve10:new int[]{0,0};
    }
    public static void main(String[] args) {
        System.out.println(
                "Result: " + Arrays.toString(solve10())
        );
    }

}
