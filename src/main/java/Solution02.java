/*
 *  UCF COP3330 Fall 2021 Exercise 2 Solution
 *  Copyright 2021 Joshua Davis
 */

import java.util.Scanner;

public class Solution02 {
    /* Begin pseudocode */
    // Create Scanner object.
    // Create variable to store scanned input.
    // Prompt user for input
    // Provide character count.
    /* End pseudocode */

    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        String input;
        String inputLower;
        System.out.print("What is the input string? ");
        input = scanInput.nextLine();
        System.out.println(input + " has " + input.length() + " characters.");
    }



}
