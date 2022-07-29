import java.util.HashSet;

/**
 * Created by cesarwillymamanicanaza on 28/07/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class IsTrivalent {
    static int isTrivalent (int[ ] a){
        HashSet<Integer> isTrivalent = new HashSet<>();
        for(int index:a){
            isTrivalent.add(index);
        }
        return isTrivalent.size() == 3? 1:0;
    }
    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
    }
}
