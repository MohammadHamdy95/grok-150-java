package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidAnagramTest {
    private final ValidAnagram sol = new ValidAnagram();

    @Test void anagram() { assertTrue(sol.isAnagram("anagram", "nagaram")); }
    @Test void notAnagram() { assertFalse(sol.isAnagram("rat", "car")); }
    @Test void differentLength() { assertFalse(sol.isAnagram("a", "ab")); }
    @Test void bothEmpty() { assertTrue(sol.isAnagram("", "")); }
    @Test void sameString() { assertTrue(sol.isAnagram("abc", "abc")); }
    @Test void repeatedLetters() { assertTrue(sol.isAnagram("aabbcc", "abcabc")); }
    @Test void sameLettersDifferentCounts() { assertFalse(sol.isAnagram("aacc", "ccac")); }
}
