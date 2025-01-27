abstract class Student {
    int rollNo;
    long regNo;

   
    public void getInput(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    // Abstract method to be implemented in subclass
    public abstract void course();
}


class Kiitian extends Student {

    // Overriding the abstract method
    @Override
    public void course() {
        System.out.println("Course: B.Tech. (Computer Science & Engg)");
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Registration No: " + regNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput(2205180, 1234567890L);
        k.display();
        k.course();
    }
}