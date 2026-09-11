/**
 * Created by cesarwillymamanicanaza on 31/01/23.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 *
 */
public class IsPerfectSquare {
    static int isPerfectSquare(int n){
        int temp = 0;
        while(temp*temp<=n){
            temp++;
        }
        return temp*temp;
    }
    public static void main(String args[]) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-6));
    }
}
