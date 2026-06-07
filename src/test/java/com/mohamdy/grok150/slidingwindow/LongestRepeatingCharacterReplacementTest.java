package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestRepeatingCharacterReplacementTest {
    private final LongestRepeatingCharacterReplacement sol = new LongestRepeatingCharacterReplacement();

    @Test void example() { assertEquals(4, sol.characterReplacement("ABAB", 2)); }
    @Test void example2() { assertEquals(4, sol.characterReplacement("AABABBA", 1)); }
    @Test void noReplacement() { assertEquals(4, sol.characterReplacement("AAAA", 0)); }
    @Test void allReplaceable() { assertEquals(4, sol.characterReplacement("ABCD", 3)); }
    @Test void single() { assertEquals(1, sol.characterReplacement("A", 0)); }
    @Test void kBiggerThanString() { assertEquals(3, sol.characterReplacement("ABC", 5)); }
}
