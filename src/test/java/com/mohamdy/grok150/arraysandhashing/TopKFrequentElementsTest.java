package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TopKFrequentElementsTest {
    private final TopKFrequentElements sol = new TopKFrequentElements();

    private static int[] sorted(int[] a) { int[] c = a.clone(); Arrays.sort(c); return c; }

    @Test void example() { assertArrayEquals(new int[]{1, 2}, sorted(sol.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); }
    @Test void single() { assertArrayEquals(new int[]{1}, sol.topKFrequent(new int[]{1}, 1)); }
    @Test void allDistinctKAll() { assertArrayEquals(new int[]{1, 2, 3}, sorted(sol.topKFrequent(new int[]{3, 1, 2}, 3))); }
    @Test void negatives() { assertArrayEquals(new int[]{-1, 2}, sorted(sol.topKFrequent(new int[]{-1, -1, 2, 2, 3}, 2))); }
    @Test void ties() { assertEquals(2, sol.topKFrequent(new int[]{4, 4, 5, 5, 6}, 2).length); }
}
