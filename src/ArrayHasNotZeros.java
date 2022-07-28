/**
 * Created by cesarwillymamanicanaza on 27/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class ArrayHasNotZeros {
    static int arrayHasNoZeroes(int[] a){
        int isSuccess = 1;
        for(int index:a){
            if(index == 0){
                isSuccess = 0;
                break;
            }
        }
        return isSuccess;
    }
    public static void main(String[] args) {
        System.out.println("Result: "+ arrayHasNoZeroes(new int[]{1,2,3}));
        System.out.println("Result: "+ arrayHasNoZeroes(new int[]{1,0,4,0}));
        System.out.println("Result: "+ arrayHasNoZeroes(new int[]{1,2,3,0}));
        System.out.println("Result: "+ arrayHasNoZeroes(new int[]{0,0,0,0}));
        System.out.println("Result: "+ arrayHasNoZeroes(new int[]{}));
    }
}
