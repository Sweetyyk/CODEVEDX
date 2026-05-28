import java.util.Scanner;

public class Fibonacci {

    // Method to print Fibonacci series
    static void printSeries(int n) {

        // First two numbers
        int a = 0;
        int b = 1;

        // Display heading
        System.out.println("Fibonacci Series:");

        // Loop to print series
        for (int i = 1; i <= n; i++) {

            // Print current number
            System.out.print(a + " ");

            // Find next number
            int c = a + b;

            // Update values
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number of terms
        System.out.print("Enter number of terms: ");

        // Input validation
        if (sc.hasNextInt()) {

            int n = sc.nextInt();

            // Call method
            printSeries(n);

        } else {

            // Display error message
            System.out.println("Invalid Input");
        }

        // Close scanner
        sc.close();
    }
}

