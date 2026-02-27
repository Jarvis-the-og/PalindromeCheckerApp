package com.palindrome.app;

import java.util.Scanner;

public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1 - Stack Strategy");
        System.out.println("2 - Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if(choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        if(strategy.isPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}