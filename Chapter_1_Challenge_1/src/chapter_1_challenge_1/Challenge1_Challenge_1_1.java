/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_1_challenge_1;
 import java.util.Scanner;

public class Challenge1_Challenge_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Step 2: Find number of digits
        int numDigits = (int) Math.log10(number) + 1;

        // Step 3: Extract digits using math (no loops, no if)
        int firstDigit = number / (int) Math.pow(10, numDigits - 1); // e.g., 13579 / 10000 = 1
        int lastDigit = number % 10;                                 // e.g., 13579 % 10 = 9
        int secondDigit = (number / (int) Math.pow(10, numDigits - 2)) % 10; // e.g., 13579 / 1000 = 13 -> 13 % 10 = 3
        int secondLastDigit = (number / 10) % 10;                    // e.g., 13579 / 10 = 1357 -> 1357 % 10 = 7

        // Step 4: Perform required operations
        int product = firstDigit * lastDigit;                         // 1 * 9 = 9
        int sum = secondDigit + secondLastDigit;                      // 3 + 7 = 10

        // Step 5: Concatenate product and sum into final code
        String finalCode = "" + product + sum;                        // "9" + "10" = "910"

        // Step 6: Output result
        System.out.println("The decrypted code is: " + finalCode);

        scanner.close();
    }
}


