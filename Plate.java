import java.util.Scanner;

class Plate {
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Plate dimensions: " + length + " x " + width);
    }
}

class Box extends Plate {
    double height;

    Box() {
        super(); // Call Plate constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        System.out.println("Box dimensions: " + length + " x " + width + " x " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox() {
        super(); // Call Box constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thickness: ");
        thickness = sc.nextDouble();
        System.out.println("WoodBox dimensions: " + length + " x " + width + " x " + height + " with thickness " + thickness);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox();
    }
}