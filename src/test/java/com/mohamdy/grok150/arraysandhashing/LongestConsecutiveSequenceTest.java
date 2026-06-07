package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence sol = new LongestConsecutiveSequence();

    @Test void example() { assertEquals(4, sol.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})); }
    @Test void longerRun() { assertEquals(9, sol.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})); }
    @Test void empty() { assertEquals(0, sol.longestConsecutive(new int[]{})); }
    @Test void single() { assertEquals(1, sol.longestConsecutive(new int[]{5})); }
    @Test void duplicates() { assertEquals(3, sol.longestConsecutive(new int[]{1, 2, 2, 3})); }
    @Test void negatives() { assertEquals(5, sol.longestConsecutive(new int[]{-3, -2, -1, 0, 1})); }
    @Test void twoRunsTakesLonger() { assertEquals(7, sol.longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6})); }
}
