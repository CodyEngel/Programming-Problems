package com.geekfed.problems;

/**
 * Created by cody on 3/22/16.
 */
public class Palindrome {

    public static boolean isPalindrome(String palindrome) {
        palindrome = palindrome.replace(" ", ""); // remove spaces
        for(int i = 0, j = palindrome.length() - 1; i <= palindrome.length()/2; i++, j--) {
            if(palindrome.charAt(i) != palindrome.charAt(j)) return false;
        }
        return true;
    }
}
