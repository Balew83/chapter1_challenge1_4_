/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_challenge1_3_;
import java.util.Scanner;
 import java.util.Random;
/**
 *
 * @author du
 */
public class Chapter1_challenge1_3_ {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int health = 100;
        System.out.println("Welcome to the Dungeon Game!");
        System.out.println("Your starting health is " + health + ".");
        System.out.println("--------------------------------");

        // Loop through 5 rooms
        for (int room = 1; room <= 5; room++) {
            System.out.println("Entering room " + room + "...");
            
            int event = rand.nextInt(3) + 1; // Random event (1–3)

            switch (event) {
                case 1: // Trap
                    System.out.println("A trap sprung!");
                    health -= 20;
                    System.out.println("You lost 20 health. Current health: " + health);
                    break;

                case 2: // Healing potion
                    System.out.println("You found a healing potion!");
                    health += 15;
                    if (health > 100) {
                        health = 100;
                        System.out.println("Health cannot exceed 100. Capped to 100.");
                    }
                    System.out.println("Your health is now " + health + ".");
                    break;

                case 3: // Monster encounter
                    System.out.println("A monster appears!");
                    int monsterNumber = rand.nextInt(5) + 1;
                    int guess;
                    do {
                        System.out.print("Guess a number (1-5) to defeat it: ");
                        guess = scanner.nextInt();
                        if (guess != monsterNumber) {
                            System.out.println("Wrong! Try again.");
                        }
                    } while (guess != monsterNumber);
                    System.out.println("You defeated the monster!");
                    break;

                default:
                    System.out.println("You found nothing... it's quiet here.");
                    break;
            }

            // Check for defeat
            if (health <= 0) {
                System.out.println("Your health is now 0.");
                System.out.println("You have been defeated in room " + room + ".");
                break;
            }

            System.out.println("--------------------------------");
        }

        // If player survives all 5 rooms
        if (health > 0) {
            System.out.println("You cleared the dungeon! Victorious with " + health + " health!");
        }

        scanner.close();
    }
}
