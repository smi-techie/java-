interface Employee {
    double earnings();
    double deductions();
    double bonus(); 
}

class Manager implements Employee {
    private double basicSalary;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double earnings() {
        return basicSalary + (0.8 * basicSalary) + (0.15 * basicSalary); 
    }

    @Override
    public double deductions() {
        return 0.12 * basicSalary;
    }

    @Override
    public double bonus() {
        // Not implemented in Manager class
        return 0.0; 
    }
}

class Substaff extends Manager implements Employee {
    public Substaff(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public double bonus() {
        return 0.5 * basicSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff(basicSalary);

        System.out.println("Earnings: " + substaff.earnings());
        System.out.println("Deduction: " + substaff.deductions());
        System.out.println("Bonus: " + substaff.bonus());
    }
}