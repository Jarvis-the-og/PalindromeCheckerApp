package com.palindrome.app;

import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray())
            deque.add(c);

        boolean palindrome = true;

        while(deque.size() > 1)
        {
            if(deque.removeFirst() != deque.removeLast())
            {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}