package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidPalindromeTest {
    ValidPalindrome sol = new ValidPalindrome();

    @Test void palindrome() { assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama")); }
    @Test void notPalindrome() { assertFalse(sol.isPalindrome("race a car")); }
    @Test void blank() { assertTrue(sol.isPalindrome(" ")); }
}
