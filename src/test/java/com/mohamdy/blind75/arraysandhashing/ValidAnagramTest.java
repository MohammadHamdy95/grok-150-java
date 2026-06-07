package com.mohamdy.blind75.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidAnagramTest {
    ValidAnagram sol = new ValidAnagram();

    @Test void anagram() { assertTrue(sol.isAnagram("anagram", "nagaram")); }
    @Test void notAnagram() { assertFalse(sol.isAnagram("rat", "car")); }
    @Test void differentLength() { assertFalse(sol.isAnagram("a", "ab")); }
}
