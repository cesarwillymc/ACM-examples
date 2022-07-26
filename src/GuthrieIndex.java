/**
 * Created by cesarwillymamanicanaza on 25/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class GuthrieIndex {

    static int isOdd(int n){
        return n*3+1;
    }
    static int isEven(int n){
        return n/2;
    }
    static int guthrieIndex(int n){
        int counter = 0;
        int currentValue = n;
        while (currentValue!=1){
            if(currentValue%2==0){
                currentValue = isEven(currentValue);
            }else{
                currentValue = isOdd(currentValue);
            }
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(
                "Result: "+guthrieIndex( 1)
        );
        System.out.println(
                "Result: "+guthrieIndex( 2)
        );
        System.out.println(
                "Result: "+guthrieIndex( 3)
        );
        System.out.println(
                "Result: "+guthrieIndex( 4)
        );
        System.out.println(
                "Result: "+guthrieIndex( 42)
        );
        System.out.println(
                "Result: "+guthrieIndex( 7)
        );
    }
}
