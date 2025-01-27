import java.util.Scanner;

abstract class Plastic {
    double cost;

    abstract void calculateCost();

    void displayCost() {
        System.out.println("Cost of plastic: Rs. " + cost);
    }
}

class Sheet extends Plastic {
    double length, width;

    Sheet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateCost() {
        double area = length * width;
        cost = area * 40; 
    }
}

class Box extends Sheet {
    double height;

    Box(double length, double width, double height) {
        super(length, width); 
        this.height = height;
    }

    @Override
    void calculateCost() {
        double volume = length * width * height;
        cost = volume * 60; 
    }
}

public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for sheet (length width): ");
        double sheetLength = scanner.nextDouble();
        double sheetWidth = scanner.nextDouble();
        Sheet sheet = new Sheet(sheetLength, sheetWidth);
        sheet.calculateCost();
        sheet.displayCost();

        System.out.println("Enter dimensions for box (length width height): ");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        box.calculateCost();
        box.displayCost();

        scanner.close();
    }
}