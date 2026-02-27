package com.palindrome.app;

import java.util.Scanner;

public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        PalindromeService service = new PalindromeService();

        if(service.isPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}