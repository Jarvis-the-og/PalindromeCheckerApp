package com.palindrome.app;

import java.util.Scanner;

public class PalindromeApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" PALINDROME CHECKER APP ");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--)
        {
            reversed = reversed + word.charAt(i);
        }

        if(word.equalsIgnoreCase(reversed))        {
            System.out.println(word + " is Palindrome");
        }
        else
        {
            System.out.println(word + " is NOT Palindrome");
        }

        sc.close();
    }
}