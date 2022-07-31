/**
 * Created by cesarwillymamanicanaza on 30/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class FullnessQuotient {
    static int fullnessQuotient(int n) {
        if(n<1) return -1;
        int fullnessQuotient = 0;
        for (int base = 1;base<=9;base++) {
            int number =n;
            do{
                if(number%base==0){
                    break;
                }
                number/=base;
            }while (number>0);
            if(number==0){
                fullnessQuotient++;
            }
        }
        return fullnessQuotient;
    }

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }
}
