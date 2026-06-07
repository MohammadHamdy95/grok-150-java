package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidPalindromeTest {
    private final ValidPalindrome sol = new ValidPalindrome();

    @Test void palindrome() { assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama")); }
    @Test void notPalindrome() { assertFalse(sol.isPalindrome("race a car")); }
    @Test void onlySpace() { assertTrue(sol.isPalindrome(" ")); }
    @Test void empty() { assertTrue(sol.isPalindrome("")); }
    @Test void alphanumericMix() { assertTrue(sol.isPalindrome("0P0")); }
    @Test void digitsPalindrome() { assertTrue(sol.isPalindrome("12321")); }
    @Test void digitsNotPalindrome() { assertFalse(sol.isPalindrome("12345")); }
    @Test void singleChar() { assertTrue(sol.isPalindrome("a")); }
}
