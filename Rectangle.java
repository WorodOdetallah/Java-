// Question:
// Write a Java program that defines a class named Rectangle. This class should have two private instance variables width and height of type double. 
// It should have a constructor that takes two parameters, width and height, and initializes the respective instance variables. 
//  If a negative value is passed to either the width or height, they should be set to 0.0.
// The class should also include two methods, getArea() and getPerimeter(), which calculate and return the area and perimeter of the rectangle, respectively.
// Additionally, provide getWidth() and getHeight() accessor methods to retrieve the values of width and height.

// Answer: 

public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        // If width or height is negative, initialize them to 0.0
        this.width = (width < 0) ? 0.0 : width;
        this.height = (height < 0) ? 0.0 : height;
    }

    // Accessor method for width
    public double getWidth() {
        return width;
    }

    // Accessor method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
