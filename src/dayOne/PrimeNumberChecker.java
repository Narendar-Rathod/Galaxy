package dayOne;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Variable to count divisors
        int count = 0;

        // Check divisors from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // Increment count for each divisor
            }
        }

        // A prime number has exactly 2 divisors: 1 and itself
        if (count == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
