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

        char[] arr = word.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            if(arr[start] != arr[end])
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome)
            System.out.println(word + " is Palindrome");
        else
            System.out.println(word + " is NOT Palindrome");

        sc.close();
    }
}