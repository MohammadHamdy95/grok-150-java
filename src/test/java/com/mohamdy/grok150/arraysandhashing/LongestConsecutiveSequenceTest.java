package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence sol = new LongestConsecutiveSequence();

    @Test void example() { assertEquals(4, sol.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})); }
    @Test void example2() { assertEquals(9, sol.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})); }
    @Test void empty() { assertEquals(0, sol.longestConsecutive(new int[]{})); }
    @Test void single() { assertEquals(1, sol.longestConsecutive(new int[]{5})); }
    @Test void duplicates() { assertEquals(1, sol.longestConsecutive(new int[]{1, 1, 1})); }
}
