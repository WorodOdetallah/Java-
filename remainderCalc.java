import java.util.Scanner;

public class RemainderCalc {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println(" Enter the first integer (x) : ");
        int x = scanner.nextInt();

        System.out.println(" Enter the second integer (y) : ");
        int y = scanner.nextInt();

        int remainder = x % y;
        System.out.println(" The remainder of division x by y is : " + remainder);

        scanner.close();
    }
}
