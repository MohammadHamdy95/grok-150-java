package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LargestRectangleInHistogramTest {
    private final LargestRectangleInHistogram sol = new LargestRectangleInHistogram();

    @Test void example() { assertEquals(10, sol.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3})); }
    @Test void two() { assertEquals(4, sol.largestRectangleArea(new int[]{2, 4})); }
    @Test void single() { assertEquals(5, sol.largestRectangleArea(new int[]{5})); }
    @Test void uniform() { assertEquals(12, sol.largestRectangleArea(new int[]{3, 3, 3, 3})); }
    @Test void increasing() { assertEquals(9, sol.largestRectangleArea(new int[]{1, 2, 3, 4, 5})); }
    @Test void withZero() { assertEquals(4, sol.largestRectangleArea(new int[]{2, 0, 2, 2})); }
}
