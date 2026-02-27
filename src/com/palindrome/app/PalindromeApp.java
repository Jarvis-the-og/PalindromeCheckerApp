package com.palindrome.app;

import java.util.Scanner;

public class PalindromeApp {

    static boolean check(String s, int start, int end)
    {
        if(start >= end)
            return true;

        if(s.charAt(start) != s.charAt(end))
            return false;

        return check(s,start+1,end-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        boolean result = check(word,0,word.length()-1);

        System.out.println(result ? "Palindrome":"Not Palindrome");

        sc.close();
    }
}