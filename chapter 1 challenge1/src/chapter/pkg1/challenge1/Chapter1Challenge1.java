import java.util.Scanner;

public class Chapter1_Challenge_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Step 2: Count digits
        int numDigits = (int) Math.log10(number) + 1;

        // Step 3: Extract digits using math (no loops, no if)
        int firstDigit = (int) (number / Math.pow(10, numDigits - 1));   // first digit
        int lastDigit = number % 10;                                     // last digit

        // Extract second and second-last digits
        int secondDigit = (int) (number / Math.pow(10, numDigits - 2)) % 10;
        int secondLastDigit = (number / 10) % 10;

        // Step 4: Perform required operations
        int product = firstDigit * lastDigit;
        int sum = secondDigit + secondLastDigit;

        // Step 5: Combine as final code
        String finalCode = "" + product + sum;

        // Step 6: Output
        System.out.println("The decrypted code is: " + finalCode);
    }
}
