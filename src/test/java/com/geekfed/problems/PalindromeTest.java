package com.geekfed.problems;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by cody on 3/22/16.
 */
public class PalindromeTest {

    @Test
    public void test_PalindromeWithEvenNumberOfCharacters() {
        assertTrue(Palindrome.isPalindrome("anna"));
    }

    @Test
    public void test_NotAPalindromeWithEvenNumberOfCharacters() {
        assertFalse(Palindrome.isPalindrome("cody"));
    }

    @Test
    public void test_PalindromeWithOddNumberOfCharacters() {
        assertTrue(Palindrome.isPalindrome("ana"));
    }

    @Test
    public void test_NotAPalindromeWithOddNumberOfCharacters() {
        assertFalse(Palindrome.isPalindrome("odd"));
    }

    @Test
    public void test_PalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("a but tuba"));
    }

    @Test
    public void test_NotAPalindromeWithSpaces() {
        assertFalse(Palindrome.isPalindrome("a butt tub"));
    }
}
