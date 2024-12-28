package javaworld;

import java.util.Scanner;


		public class BankAccountDemo {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Initialize a new bank account
		        System.out.print("Enter account holder name: ");
		        String name = scanner.nextLine();
		        System.out.print("Enter initial balance: ");
		        double initialBalance = scanner.nextDouble();

		        BankAccount account = new BankAccount(name, initialBalance);

		        // Display menu options
		        int choice;
		        do {
		            System.out.println("\n--- Bank Account Menu ---");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Check Balance");
		            System.out.println("4. Account Details");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter amount to deposit: ");
		                    double depositAmount = scanner.nextDouble();
		                    account.deposit(depositAmount);
		                    break;
		                case 2:
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdrawAmount = scanner.nextDouble();
		                    account.withdraw(withdrawAmount);
		                    break;
		                case 3:
		                    System.out.println("Current Balance: " + account.getBalance());
		                    break;
		                case 4:
		                    account.displayAccountDetails();
		                    break;
		                case 5:
		                    System.out.println("Thank you for using the bank account system. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }

		        while (choice != 5);
		        scanner.close();
		    }
		}

	
