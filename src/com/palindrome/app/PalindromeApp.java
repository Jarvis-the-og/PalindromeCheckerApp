package com.palindrome.app;

public class PalindromeApp {

    // Reverse String Method
    static boolean reverseMethod(String word)
    {
        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--)
            reversed += word.charAt(i);

        return word.equals(reversed);
    }

    // Character Array Method
    static boolean arrayMethod(String word)
    {
        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            if(arr[start] != arr[end])
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        long start1 = System.nanoTime();
        reverseMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        arrayMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Time: " + (end1 - start1));
        System.out.println("Array Method Time: " + (end2 - start2));

    }
}