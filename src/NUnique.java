/**
 * Created by cesarwillymamanicanaza on 26/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class NUnique {
    static int isNUnique(int[ ] a, int n){
        int isSuccess =1;
        boolean exist = false;
        for(int index =0;index<a.length;index++){
            for (int secondIndex = index+1;secondIndex<a.length;secondIndex++){

                if((a[index] + a[secondIndex]) == n){
                    if(!exist){
                        exist  = true;
                    }else{
                        isSuccess = 0;
                        break;
                    }
                }
            }
        }
        return exist?isSuccess:0;
    }
    public static void main(String[] args) {
        System.out.println(
                "Result: "+ isNUnique(new int[]{7,3,3,2,4}, 6)
        );
        System.out.println(
                "Result: "+ isNUnique(new int[]{7,3,3,2,4}, 10)
        );
        System.out.println(
                "Result: "+ isNUnique(new int[]{7,3,3,2,4}, 11)
        );
        System.out.println(
                "Result: "+ isNUnique(new int[]{7,3,3,2,4}, 8)
        );
        System.out.println(
                "Result: "+ isNUnique(new int[]{7,3,3,2,4}, 4)
        );
        System.out.println(
                "Result: "+ isNUnique(new int[]{1}, 6)
        );
        System.out.println(
                "Result: "+ isNUnique(new int[]{2, 7, 3, 4}, 5)
        );
        System.out.println(
                "Result: "+ isNUnique(new int[]{2, 3, 3, 7}, 5)
        );
    }
}
