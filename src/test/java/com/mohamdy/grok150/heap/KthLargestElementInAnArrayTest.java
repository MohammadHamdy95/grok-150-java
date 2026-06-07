package com.mohamdy.grok150.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KthLargestElementInAnArrayTest {
    private final KthLargestElementInAnArray sol = new KthLargestElementInAnArray();

    @Test void example() { assertEquals(5, sol.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)); }
    @Test void withDuplicates() { assertEquals(4, sol.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)); }
    @Test void single() { assertEquals(1, sol.findKthLargest(new int[]{1}, 1)); }
    @Test void largest() { assertEquals(6, sol.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 1)); }
    @Test void smallest() { assertEquals(1, sol.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 6)); }
    @Test void negatives() { assertEquals(-2, sol.findKthLargest(new int[]{-1, -2, -3}, 2)); }
}
