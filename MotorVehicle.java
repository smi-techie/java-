class MotorVehicle {
    String modelname;
    int modelno;
    double modelprice;

    public void display() {
        System.out.println("Model Name: " + modelname);
        System.out.println("Model No: " + modelno);
        System.out.println("Model Price: " + modelprice);
    }
}

class Car extends MotorVehicle {
    double discountrate;

    public void display() {
        super.display(); // Call the display() method of the parent class
        System.out.println("Discount Rate: " + discountrate + "%");
    }

    public double discount() {
        return (modelprice * discountrate) / 100;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.modelname = "Sedan";
        myCar.modelno = 2023;
        myCar.modelprice = 25000.00;
        myCar.discountrate = 10.0; 

        myCar.display();
        double discountAmount = myCar.discount();
        System.out.println("Discount Amount: " + discountAmount);
    }
}