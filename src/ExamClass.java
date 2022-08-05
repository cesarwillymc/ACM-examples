/**
 * Created by cesarwillymamanicanaza on 1/08/22.
 * cesarwilly.mc@gmail.com
 * <p>
 * Lima, Peru.
 */
public class ExamClass {
    static int isMercurial(int[] a) {
        if (a.length < 3) return 1;
        boolean existFirstOne = false;
        boolean existThree = false;
        int isMercurial = 1;
        for (int index : a) {
            if(index == 3 && existFirstOne){
                existThree=true;
            }
            if (index == 1 && existFirstOne && existThree) {
                isMercurial=0;
                break;
            }
            if(index==1 && !existFirstOne){
                existFirstOne = true;
            }

        }
        return isMercurial;
    }

    public static void main(String[] args) {
        isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2});
        isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2});
        isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2});
        isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3});
        isMercurial(new int[]{2, 3, 1, 1, 18});
        isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5});
        isMercurial(new int[]{3, 3, 3, 3, 3, 3});
        isMercurial(new int[]{1});
        isMercurial(new int[]{});
    }
}
