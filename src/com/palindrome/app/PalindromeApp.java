package com.palindrome.app;

public class PalindromeApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" PALINDROME CHECKER APP ");
        System.out.println("================================");

        String word = "madam";

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--)
        {
            reversed = reversed + word.charAt(i);
        }

        if(word.equals(reversed))
        {
            System.out.println(word + " is Palindrome");
        }
        else
        {
            System.out.println(word + " is NOT Palindrome");
        }

    }
}