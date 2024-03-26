import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // two nums
        System.out.print(" add a number to A: ");
        int a = scanner.nextInt();

        System.out.print(" add a number to B: ");
        int b = scanner.nextInt();

        // print it a & b
        System.out.println(" a Before replacement = " + a + ", b before replacement = " + b);

        // Replace the values of a & b
        int temp = a;
        a = b ;
        b = temp;

        // print the new values after replacement
        System.out.println(" a After replacement = " + a + ", b After replacement = " + b);

        scanner.close();



    }

}
