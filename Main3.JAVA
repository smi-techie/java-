import java.util.Scanner;  

// Define the interface  
interface SalaryBreakdown {  
    double earnings(); // Method to calculate earnings  
    double deductions(); // Method to calculate deductions  
    double bonus(); // Method for bonus calculation  
}  

// Class Manager implementing the interface  
class Manager implements SalaryBreakdown {  
    private double basicSalary;  // Keep it private  

    // Constructor to initialize basic salary  
    public Manager(double basicSalary) {  
        this.basicSalary = basicSalary;  
    }  

    // Getter method to access basic salary  
    public double getBasicSalary() {  
        return basicSalary;  
    }  

    // Calculate earnings based on given formula  
    @Override  
    public double earnings() {  
        double da = 0.8 * basicSalary; // DA is 80% of basic  
        double hra = 0.15 * basicSalary; // HRA is 15% of basic  
        return basicSalary + da + hra; // Total earnings  
    }  

    // Calculate deductions based on given formula  
    @Override  
    public double deductions() {  
        return 0.12 * basicSalary; // PF is 12% of basic  
    }  

    // Bonus method is not implemented here  
    @Override  
    public double bonus() {  
        return 0; // This will be overridden in Substaff  
    }  
}  

// Class Substaff extending Manager  
class Substaff extends Manager {  
    
    // Constructor to initialize basic salary  
    public Substaff(double basicSalary) {  
        super(basicSalary);  
    }  

    // Implement the bonus method  
    @Override  
    public double bonus() {  
        return 0.5 * getBasicSalary(); // Bonus is 50% of basic using the getter  
    }  
}  

// Main class to execute the program  
public class Main3 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        // Input basic salary from the user  
        System.out.print("Enter Basic Salary: ");  
        double basicSalary = scanner.nextDouble();  
        
        // Create an instance of Substaff  
        Substaff substaff = new Substaff(basicSalary);  
        
        // Calculate earnings, deductions, and bonus  
        double earnings = substaff.earnings();  
        double deductions = substaff.deductions();  
        double bonus = substaff.bonus();  
        
        // Output results  
        System.out.println("Earnings: " + earnings);  
        System.out.println("Deductions: " + deductions);  
        System.out.println("Bonus: " + bonus);  
        
        // Exit scanner  
        scanner.close();  
    }  
}