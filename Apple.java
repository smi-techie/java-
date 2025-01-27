class Apple {
    void show() {
        System.out.println("This is an Apple.");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("This is a Banana.");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("This is a Cherry.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple banana = new Banana(); // Upcasting
        Apple cherry = new Cherry(); // Upcasting

        apple.show();
        banana.show();
        cherry.show();
    }
}