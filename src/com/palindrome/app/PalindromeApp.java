package com.palindrome.app;

import java.util.Scanner;

public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        word = word.replaceAll(" ","").toLowerCase();

        String rev="";

        for(int i=word.length()-1;i>=0;i--)
            rev+=word.charAt(i);

        System.out.println(word.equals(rev) ? "Palindrome":"Not Palindrome");

        sc.close();
    }
}