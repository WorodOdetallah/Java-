import java.util.Scanner;

public class Shapes2 {
    // --- Input statement: side is the length of the side of the square ---
    // --- Output statement: Draw a square whose side length is side ---
    static void drawSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                System.out.print(" * ");
            System.out.println();
        }

    }

    // --- Input statement: length and width The length of the sides of the rectangle ---
    // --- Exit assertion: A rectangle whose sides are length and width is drawn ---
    static void drawRectangle(int length, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++)
                System.out.print(" * ");
            System.out.println();

        }
    }

    // --- Input statement: trigSide Perpendicular length of a right triangle ---
    // --- Output assertion: A triangle is drawn whose length of each perpendicular is trigSide ---
    static void drawTriangle(int trigSide) {
        for (int i = 0; i < trigSide; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" * ");
            System.out.println();

        }
    }

    static void showMenu() {
        System.out.println(" menu of trigo shapes ");
        System.out.println(" 1. Square ");
        System.out.println(" 2. Rectangle ");
        System.out.println(" 3. Triangle ");
        System.out.println();
    }

    public static void main(String[] args) {
        int choice;
        int side1, side2;
        Scanner input = new Scanner(System.in);

        showMenu();
        System.out.print(" Enter your choice ---> ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.print(" Enter the square length ---> ");
            side1 = input.nextInt();
            drawSquare(side1);
        }

        if (choice == 2) {
            System.out.print(" Enter the Rectangle length ---> ");
            side1 = input.nextInt();
            System.out.print(" Enter the Rectangle width ---> ");
            side2 = input.nextInt();
            drawRectangle(side1, side2);
        }

        if (choice == 3) {
            System.out.print(" Enter the Triangle base length ---> ");
            side1 = input.nextInt();
            drawTriangle(side1);
        }
    }
}




