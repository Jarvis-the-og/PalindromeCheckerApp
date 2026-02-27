package com.palindrome.app;

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" PALINDROME CHECKER APP ");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert into Stack and Queue
        for(int i = 0; i < word.length(); i++)
        {
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare Stack and Queue
        while(!stack.isEmpty())
        {
            if(stack.pop() != queue.remove())
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