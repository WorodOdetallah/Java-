//Q3
public class BalancedArray {
    public static boolean iaBalancedArray(int [] arr){
        int countPos=0,countNeg=0,countZero=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
                countPos++;
            if (arr[i]<0)
                countNeg++;
            if (arr[i]==0)
                countZero++;
        }
        if (countZero==0 && countPos==countNeg)
            return true;
else {
            return false;
        }
    }
// B_ o(n) כי אנחנו עוברים על המערך פעם אחת
}
