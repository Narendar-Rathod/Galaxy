package javaworld;

	
import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to display account information
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

