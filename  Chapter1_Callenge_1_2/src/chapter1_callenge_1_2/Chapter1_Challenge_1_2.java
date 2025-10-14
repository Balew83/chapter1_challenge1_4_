/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_callenge_1_2;
 import java.util.*;

public class Chapter1_Challenge_1_2 {
    public static void main(String[] args) {

        // Step 1: Initialize the array of winning numbers
        String[] winningNumbers = {"12-34-56-78-90", "33-44-11-66-22", "01-02-03-04-05"};

        double highestAverage = 0; // to store the highest average found
        String winningTicket = ""; // to store the number with the highest average

        // Step 2: Process each winning number
        for (String number : winningNumbers) {
            System.out.println("Analyzing: " + number);

            // Remove dashes (-) to get continuous digits
            String digitsOnly = number.replace("-", "");

            // Convert to character array
            char[] digitChars = digitsOnly.toCharArray();

            // Create integer array from char array
            int[] digitValues = new int[digitChars.length];
            int sum = 0;

            // Using for loop to convert and sum digits
            for (int i = 0; i < digitChars.length; i++) {
                digitValues[i] = Character.getNumericValue(digitChars[i]);
                sum += digitValues[i];
            }

            // Calculate average
            double average = (double) sum / digitValues.length;

            // Print analysis
            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);

            // Check if this has the highest average
            if (average > highestAverage) {
                highestAverage = average;
                winningTicket = number;
            }
            System.out.println();
        }

        // Step 3: Announce the final result
        System.out.println("The winning number with the highest average is: " 
            + winningTicket + " with an average of " + highestAverage);
    }
}

    