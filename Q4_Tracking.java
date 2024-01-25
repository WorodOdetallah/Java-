public class Q4_Tracking {
    public static void main(String[] args) {
        int k,m;
        int x=1;
        for (m = 0; m <=3; m++) {
            for (k = m; k <=2; k++) {
                System.out.println(k*m*x);
                x++;
            }
        }
    }

}
