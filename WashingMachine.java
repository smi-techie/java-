interface Motor {
    int capacity = 1000; // Interface constant for motor capacity (can be modified)

    void run(); // Abstract method for motor operation

    void consume(); // Abstract method for motor consumption
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine motor is running...");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine motor is consuming electricity...");
    }

    public void checkCapacity() {
        System.out.println("Capacity of the motor is: " + Motor.capacity + " units");
    }
}

public class Main {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();
        machine.run();
        machine.consume();
        machine.checkCapacity();
    }
}