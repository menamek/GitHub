/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkchar;

import java.util.Scanner;

/**
 *
 * @author mena
 */
public class CheckChar {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter a character: ");
            String c = in.nextLine();
            char input = c.charAt(0);

            boolean b = false;
            if (input >= 'a' && input <= 'z') {
                System.out.println("Lowercase");
                b = true;
                if (input == 'a') {
                    System.out.println("Vowel.");
                }
                if (input == 'e') {
                    System.out.println("Vowel.");
                }
                if (input == 'i') {
                    System.out.println("Vowel.");
                }
                if (input == 'o') {
                    System.out.println("Vowel.");
                }
                if (input == 'u') {
                    System.out.println("Vowel.");
                }
            }

            if (input >= 'A' && input <= 'Z') {
                System.out.println("Uppercase");
                b = true;
                if (input == 'A') {
                    System.out.println("Vowel.");
                }
                if (input == 'E') {
                    System.out.println("Vowel.");
                }
                if (input == 'I') {
                    System.out.println("Vowel.");
                }
                if (input == 'O') {
                    System.out.println("Vowel.");
                }
                if (input == 'U') {
                    System.out.println("Vowel.");
                }
            }

            if (input >= '0' && input <= '9') {
                b = true;
                System.out.println("Number");
            }

            if (b == false) {
                System.out.println("It is a special character");
            }
        }
    }

}
