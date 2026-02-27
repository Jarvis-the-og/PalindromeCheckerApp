package com.palindrome.app;

import java.util.*;

public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for(char c : word.toCharArray())
            list.add(c);

        boolean palindrome = true;

        while(list.size() > 1)
        {
            if(list.removeFirst() != list.removeLast())
            {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}