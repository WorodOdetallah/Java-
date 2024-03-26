import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" Enter a 4-digits number : ");
        int num = scanner.nextInt();

        if(num < 1000 || num > 9999){
            System.out.println("The number entered is not a 4-digits number " );
        } else {
            // Method 1 : using arithmetic operations
            System.out.println(" Method 1 : using arithmetic operations ");
            int thousands = (num / 1000);
            int hundreds = (num % 1000) / 100;
            int tens = (num % 100) / 10;
            int ones = num % 10;

            System.out.println(thousands);
            System.out.println(hundreds);
            System.out.println(tens);
            System.out.println(ones);

            // Method 2 : using String manipulation
            System.out.println(" Method 2 : using String manipulation ");
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++){
                System.out.println(numStr.charAt(i));
            }
        }
    }
}
