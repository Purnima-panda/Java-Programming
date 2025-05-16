import java.util.Scanner;

// Class representing a bank account
class BankAccount {
    String accountNumber, accountHolder;
    double balance;

    // 1. Constructor that takes accountNumber and accountHolder, sets balance to 0.0
    BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // 2. Constructor that takes all three attributes
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this(accountNumber, accountHolder); // Call previous constructor
        this.balance = balance;
    }

    // Method to deposit amount
    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw amount
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn: Rs. " + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("------------------------\n");
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String acno = sc.nextLine();

        System.out.print("Enter initial balance for second account: ");
        double bala = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double with = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();

        // First constructor usage
        BankAccount ba1 = new BankAccount(acno, name);
        ba1.withdraw(with); // Attempt withdrawal on zero balance
        ba1.deposit(dep);   // Deposit amount
        ba1.display();

        System.out.println("End of First Constructor.\n");

        // Second constructor usage
        BankAccount ba2 = new BankAccount(acno, name, bala);
        ba2.deposit(dep);   // Deposit into pre-balanced account
        ba2.withdraw(with); // Attempt withdrawal
        ba2.display();

    }
}
