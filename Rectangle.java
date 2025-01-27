import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Method to read dimensions
    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        length = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        breadth = sc.nextDouble();
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Method to display the results
    public void display() {
        System.out.println("Area of the rectangle: " + calculateArea());
        System.out.println("Perimeter of the rectangle: " + calculatePerimeter());
    }
}