 
    import java.util.Scanner;

public class Chapter1_Challenge_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Step 2: Count digits
        int digits = (int) Math.log10(number) + 1;

        // Step 3: Extract digits
        int firstDigit = number / (int) Math.pow(10, digits - 1);
        int lastDigit = number % 10;
        int secondDigit = (number / (int) Math.pow(10, digits - 2)) % 10;
        int secondLastDigit = (number / 10) % 10;

        // Step 4: Compute product and sum
        int product = firstDigit * lastDigit;
        int sum = secondDigit + secondLastDigit;

        // Step 5: Combine them as a "code"
        String finalCode = Integer.toString(product) + Integer.toString(sum);

        // Step 6: Output the result
        System.out.println("The decrypted code is: " + finalCode);

        scanner.close();
    }
}

