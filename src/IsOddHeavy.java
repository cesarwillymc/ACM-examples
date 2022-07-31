/**
 * Created by cesarwillymamanicanaza on 30/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsOddHeavy {
    static int isOddHeavy(int[] a) {
        int lessOddIndex=-1;
        int mayorEvenIndex=-1;
        int isSuccess = 1;
        for (int index = 0;index<a.length;index++){
            if(a[index]%2==0){
                if(mayorEvenIndex == -1){
                    mayorEvenIndex = index;
                }else{
                    if(a[index]>a[mayorEvenIndex]){
                        mayorEvenIndex = index;
                    }
                }
            }else{
                if(lessOddIndex == -1){
                    lessOddIndex = index;
                }else{
                    if(a[index]<a[lessOddIndex]){
                        lessOddIndex = index;
                    }
                }
            }
        }
        if(lessOddIndex == -1){
            isSuccess = 0;
        }else if(mayorEvenIndex != -1){
            if(a[mayorEvenIndex]>a[lessOddIndex]){
                isSuccess =0;
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1,1,1,1,1}));
        System.out.println(isOddHeavy(new int[]{2,4,6,8,11}));
        System.out.println(isOddHeavy(new int[]{-2,-4,-6,-8,-11}));
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
    }
}
