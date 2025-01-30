import java.util.Scanner;  

class LoanScheme {  
    protected double amount;  
    protected double rate;  
    protected int duration; // tenure in years  
    protected String aadhar;  
    protected double monthlyIncome;  
    protected int creditScore;  

    public LoanScheme(double amount, double rate, int duration, String aadhar, double monthlyIncome, int creditScore) {  
        this.amount = amount;  
        this.rate = rate;  
        this.duration = duration;  
        this.aadhar = aadhar;  
        this.monthlyIncome = monthlyIncome;  
        this.creditScore = creditScore;  
    }  

    public boolean isEligibleForLoan() {  
        return monthlyIncome > 20000 && creditScore >= 700;  
    }  

    public double computeEMI() {  
        double monthlyRate = rate / (12 * 100);  
        int totalMonths = duration * 12;  
        return (amount * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /  
               (Math.pow(1 + monthlyRate, totalMonths) - 1);  
    }  
}  

class HousingLoan extends LoanScheme {  
    public HousingLoan(double amount, String aadhar, double monthlyIncome, int creditScore) {  
        super(amount, 8.5, 20, aadhar, monthlyIncome, creditScore);  
    }  
}  

class UnsecuredLoan extends LoanScheme {  
    public UnsecuredLoan(double amount, String aadhar, double monthlyIncome, int creditScore) {  
        super(amount, 12.0, 5, aadhar, monthlyIncome, creditScore);  
    }  
}  

class VehicleLoan extends LoanScheme {  
    public VehicleLoan(double amount, String aadhar, double monthlyIncome, int creditScore) {  
        super(amount, 9.0, 7, aadhar, monthlyIncome, creditScore);  
    }  
}  

public class LoanEstimator {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter the desired loan amount: ");  
        double loanAmount = scanner.nextDouble();  
        scanner.nextLine(); // Consume newline  

        System.out.print("Enter your Aadhar number: ");  
        String aadharNumber = scanner.nextLine();  

        System.out.print("Enter your monthly income: ");  
        double income = scanner.nextDouble();  

        System.out.print("Enter your credit score: ");  
        int score = scanner.nextInt();  

        System.out.println("Choose the type of loan: 1. Housing Loan  2. Unsecured Loan  3. Vehicle Loan");  
        int selection = scanner.nextInt();  

        LoanScheme selectedLoan = null;  
        switch (selection) {  
            case 1: selectedLoan = new HousingLoan(loanAmount, aadharNumber, income, score); break;  
            case 2: selectedLoan = new UnsecuredLoan(loanAmount, aadharNumber, income, score); break;  
            case 3: selectedLoan = new VehicleLoan(loanAmount, aadharNumber, income, score); break;  
            default:   
                System.out.println("Invalid selection. Exiting program.");   
                return;  
        }  

        if (selectedLoan.isEligibleForLoan()) {  
            System.out.println("Congratulations, you qualify for the loan!");  
            System.out.printf("Your EMI for %d years: %.2f INR per month\n", selectedLoan.duration, selectedLoan.computeEMI());  
            System.out.printf("If you choose a tenure of %d years: %.2f INR per month\n", selectedLoan.duration / 2,   
                              new LoanScheme(loanAmount, selectedLoan.rate, selectedLoan.duration / 2, aadharNumber, income, score).computeEMI());  
        } else {  
            System.out.println("Sorry, you do not meet the eligibility criteria for the loan.");  
        }  

        scanner.close();  
    }  
}