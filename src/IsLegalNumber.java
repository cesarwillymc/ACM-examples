/**
 * Created by cesarwillymamanicanaza on 26/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsLegalNumber {
    static int isLegalNumber(int[ ] a, int base){
        int isSuccess = 1;
        for (int index:a){
            if(index>=base){
                isSuccess =0;
                break;
            }
        }
        return isSuccess;
    }
    public static void main(String[] args) {
        System.out.println(
                "Result: "+ isLegalNumber(new int[]{3, 2, 1}, 4)
        );
        System.out.println(
                "Result: "+ isLegalNumber(new int[]{3, 7, 1}, 6)
        );
    }
}
