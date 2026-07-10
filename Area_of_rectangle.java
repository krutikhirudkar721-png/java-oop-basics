//Area-Calculating-In-Java
// Write a Program using class Rectangle and calculate area using (method)

import java.util.Scanner;
public class MyProgram {
    public static void main(String[] args) {
        // Using try-with-resources for automatic Scanner closing
        try (Scanner sc = new Scanner(System.in)) {
            Rectangle r1 = new Rectangle();

            System.out.print("Enter height: ");
            float h = sc.nextFloat();
            r1.setHeight(h);

            System.out.print("Enter width: ");
            float w = sc.nextFloat();
            r1.setWidth(w);

            // Display results
            r1.displayDetails();
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter numeric values.");
        }
    }
}

class Rectangle {
    private float height;
    private float width;

    // Default Constructor
    public Rectangle() {}

    // Parameterized Constructor (Better for efficiency)
    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    // Setters with basic validation
    public void setHeight(float height) {
        this.height = (height > 0) ? height : 0;
    }
    public void setWidth(float width) {
        this.width = (width > 0) ? width : 0;
    }

    // Logic separated from Printing
    public float calculateArea() {
        return height * width;
    }

    public void displayDetails() {
        if (height == 0 || width == 0) {
            System.out.println("Error: Dimensions must be greater than zero.");
        } else {
            System.out.println("--- Rectangle Details ---");
            System.out.println("Height: " + height);
            System.out.println("Width : " + width);
            System.out.println("Area  : " + calculateArea());
        }
    }
}

