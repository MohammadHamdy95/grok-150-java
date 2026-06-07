package com.mohamdy.blind75.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestRepeatingCharacterReplacementTest {
    LongestRepeatingCharacterReplacement sol = new LongestRepeatingCharacterReplacement();

    @Test void example() { assertEquals(4, sol.characterReplacement("ABAB", 2)); }
    @Test void example2() { assertEquals(4, sol.characterReplacement("AABABBA", 1)); }
}
