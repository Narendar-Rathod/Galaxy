package javaworld;

      class BankDetails {

	    private String accountHolderName;
	    private double balance;

	    public BankDetails(String name, double initialBalance) {
	        this.accountHolderName = name;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	public class MainClass {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("John Doe", 500);

	        account.deposit(200);
	        account.withdraw(100);

	        System.out.println("Current balance: " + account.getBalance());
	    }
	}