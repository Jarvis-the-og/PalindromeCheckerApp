package com.palindrome.app;

public class PalindromeService {

    public boolean isPalindrome(String word) {

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--)
        {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }
}