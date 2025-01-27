// Abstract class Accounts
abstract class Accounts {
    protected double balance;
    protected String accountNo;
    protected String accountHolderName;
    protected String address;

    // Constructor to initialize the account details
    public Accounts(String accountNo, String accountHolderName, String address, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }

    // Abstract methods for withdrawal and deposit
    public abstract void withdrawal(double amount);
    public abstract void deposit(double amount);

    // Method to display balance of the account
    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends Accounts {
    private double rateOfInterest;

    // Constructor to initialize the savings account
    public SavingsAccount(String accountNo, String accountHolderName, String address, double balance, double rateOfInterest) {
        super(accountNo, accountHolderName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }

    // Implementation of withdrawal method
    @Override
    public void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn from your account.");
        }
    }

    // Implementation of deposit method
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited to your account.");
    }

    // Method to calculate amount with interest and display details
    public void calculateAmount() {
        double amountWithInterest = balance + (balance * rateOfInterest / 100);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Amount after interest: " + amountWithInterest);
    }

    // Overriding display method to show rate of interest and new balance
    @Override
    public void display() {
        super.display();
        calculateAmount();
    }
}

// Subclass CurrentAccount
class CurrentAccount extends Accounts {
    private double overdraftLimit;

    // Constructor to initialize the current account
    public CurrentAccount(String accountNo, String accountHolderName, String address, double balance, double overdraftLimit) {
        super(accountNo, accountHolderName, address, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Implementation of withdrawal method
    @Override
    public void withdrawal(double amount) {
        if (amount > (balance + overdraftLimit)) {
            System.out.println("Withdrawal amount exceeds overdraft limit!");
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn from your account.");
        }
    }

    // Implementation of deposit method
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited to your account.");
    }

    // Overriding display method to show overdraft limit and account holder's name
    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main class to test the functionality
public class Main6 {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", "123 Street, City", 5000.0, 4.5);
        savingsAccount.display();
        savingsAccount.deposit(1000);
        savingsAccount.withdrawal(1500);
        savingsAccount.display();

        // Creating a CurrentAccount object
        CurrentAccount currentAccount = new CurrentAccount("CA123", "Jane Smith", "456 Avenue, City", 2000.0, 1000.0);
        currentAccount.display();
        currentAccount.deposit(500);
        currentAccount.withdrawal(2200);
        currentAccount.display();
    }
}
