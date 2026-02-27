package com.palindrome.app;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray())
            deque.add(c);

        while(deque.size() > 1)
        {
            if(deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}