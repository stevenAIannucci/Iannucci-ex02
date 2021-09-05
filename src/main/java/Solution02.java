/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Steven Iannucci
 */

import java.util.Scanner;

public class Solution02 {

    public static void main(String[ ] args) {
        //print "What is the input string? "
        //add user input to variable string
        //add built-in count function with for loop
        //print the output including variable string
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string? ");
        String string = (input.nextLine());
        int count = 0;
                for (int n = 0; n < string.length(); n++) {
                    if (Character.isLetter(string.charAt(n))) count++;
                }
                System.out.println(string + " has " + count + " characters.");
    }

}
