import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void disp() {
        super.disp(); // Call disp() from Account
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); // Call input() from Account
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = sc.next();
    }
}

public class AccountPerson {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            persons[i].input();
        }

        for (Person person : persons) {
            person.disp();
            System.out.println("--------------------");
        }
    }
}