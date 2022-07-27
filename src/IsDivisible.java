/**
 * Created by cesarwillymamanicanaza on 26/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsDivisible {
    static int isDivisible(int [ ] a, int divisor){
        int isSuccess = 1;
        for(int index : a){
            if(index %divisor!=0){
                isSuccess=0;
                break;
            }
        }
        return isSuccess;
    }
    public static void main(String[] args) {
        System.out.println(
                "Result: "+ isDivisible(new int[]{3, 3, 6, 36},3)
        );
        System.out.println(
                "Result: "+ isDivisible(new int[]{4},2)
        );

        System.out.println(
                "Result: "+ isDivisible(new int[]{3, 4, 3, 6, 36},3)
        );
        System.out.println(
                "Result: "+ isDivisible(new int[]{6, 12, 24, 36},12)
        );
        System.out.println(
                "Result: "+ isDivisible(new int[]{},10)
        );
    }
}
