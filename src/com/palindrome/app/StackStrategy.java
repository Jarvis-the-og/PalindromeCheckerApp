package com.palindrome.app;

import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray())
            stack.push(c);

        for(char c : word.toCharArray())
        {
            if(c != stack.pop())
                return false;
        }

        return true;
    }
}