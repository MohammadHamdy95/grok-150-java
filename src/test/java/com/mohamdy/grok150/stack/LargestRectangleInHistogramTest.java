package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LargestRectangleInHistogramTest {
    LargestRectangleInHistogram sol = new LargestRectangleInHistogram();

    @Test void example() { assertEquals(10, sol.largestRectangleArea(new int[]{2,1,5,6,2,3})); }
    @Test void example2() { assertEquals(4, sol.largestRectangleArea(new int[]{2,4})); }
}
