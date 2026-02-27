package com.palindrome.app;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" PALINDROME CHECKER APP ");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(int i = 0; i < word.length(); i++)
        {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) != stack.pop())
            {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println(word + " is Palindrome");
        else
            System.out.println(word + " is NOT Palindrome");

        sc.close();
    }
}