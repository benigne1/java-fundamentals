package java_objects;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance < 0) {
            this.balance = 0.0;
            System.out.println("Warning: balance cannot be negative.");
        } else {
            this.balance = initialBalance;
        }
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }

    public void setAccountHolderName(String newName) {
        this.accountHolderName = newName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double calculateLoan() {
        if (balance < 10000) {
            return balance * 0.10;
        } else if (balance <= 60000) {
            return balance * 0.25;
        } else {
            return balance * 0.30;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + " | Name: " + accountHolderName
                + " | Balance: " + balance + " | Loan: " + calculateLoan());
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("ACC001", "Benigne", 5000);
        BankAccount a2 = new BankAccount("ACC002", "Jean", 25000);
        BankAccount a3 = new BankAccount("ACC003", "Aline", -500);

        a1.deposit(1000);
        a2.withdraw(3000);
        a3.deposit(200);

        a1.displayAccountDetails();
        a2.displayAccountDetails();
        a3.displayAccountDetails();
    }
}