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
    // If nothing is entered, print statement asking for revised input.
    // If "nothing" is entered, make snarky joke, then provide character count.
    // Provide character count otherwise.
    /* End pseudocode */

    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        String input;
        String inputLower;
        System.out.print("What is the input string? ");
        input = scanInput.nextLine();
        while(input.equals("")){
            System.out.println("Input must not be null. Please enter a string.");
            input = scanInput.nextLine();
        }
        inputLower = input.toLowerCase();
        if(inputLower.equals("nothing")){
            System.out.println("Very funny. " + input + " has " + input.length() + " characters.");
        }
        else{
            System.out.println(input + " has " + input.length() + " characters.");
        }
    }



}
