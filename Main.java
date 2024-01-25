import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*     String X= "water";
        String y= "kool-Aid";
        String temp;
        temp=X;
        X=y;
        y=temp;

        System.out.println("x: "+X);
        System.out.println("y: "+y);
    }

    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is you name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age =scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favorite food ?");
        String food=scanner.nextLine();


        System.out.println("Hello  " +name);
        System.out.println("you are :" + age +  "years old");
        System.out.println("you like "+ food);



    }
}
