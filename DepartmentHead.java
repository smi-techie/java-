import java.util.Scanner;  

// Define the Employee interface  
interface Employee {  
    void getDetails();  
}  

// Define the Manager interface extending Employee  
interface Manager extends Employee {  
    void getDeptDetails();  
}  

// Class Head implementing Manager interface  
class Head implements Manager {  
    private int empId;  
    private String empName;  
    private int deptId;  
    private String deptName;  

    // Method to get employee details  
    @Override  
    public void getDetails() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter employee id: ");  
        empId = scanner.nextInt();  
        scanner.nextLine(); // Consume leftover newline  
        System.out.print("Enter employee name: ");  
        empName = scanner.nextLine();  
    }  

    // Method to get department details  
    @Override  
    public void getDeptDetails() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter department id: ");  
        deptId = scanner.nextInt();  
        scanner.nextLine(); // Consume leftover newline  
        System.out.print("Enter department name: ");  
        deptName = scanner.nextLine();  
    }  

    // Method to display all details of the head  
    public void displayDetails() {  
        System.out.println("Employee id: " + empId);  
        System.out.println("Employee name: " + empName);  
        System.out.println("Department id: " + deptId);  
        System.out.println("Department name: " + deptName);  
    }  
}  

// Main class to execute the program  
public class DepartmentHead {  
    public static void main(String[] args) {  
        Head head = new Head();  
        
        // Get employee details  
        head.getDetails();  
        
        // Get department details  
        head.getDeptDetails();  
        
        // Display all details  
        head.displayDetails();  
    }  
}