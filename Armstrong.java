import java.util.Scanner;

public class Armstrong {

    // Method to check Armstrong number
    static void checkArmstrong(int num) {

        // Store original number
        int temp = num;

        // Variable to store remainder
        int rem;

        // Variable to store final sum
        int sum = 0;

        // Loop runs until number becomes 0
        while (num > 0) {

            // Get last digit
            rem = num % 10;

            // Add cube of digit to sum
            sum = sum + (rem * rem * rem);

            // Remove last digit
            num = num / 10;
        }

        // Check Armstrong or not
        if (sum == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number
        System.out.print("Enter a number: ");

        // Input validation
        if (sc.hasNextInt()) {

            int num = sc.nextInt();

            // Call method
            checkArmstrong(num);

        } else {

            // Display error message
            System.out.println("Invalid Input");
        }

        // Close scanner
        sc.close();
    }
}

