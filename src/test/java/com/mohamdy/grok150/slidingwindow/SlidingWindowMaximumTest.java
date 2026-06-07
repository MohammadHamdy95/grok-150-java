package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SlidingWindowMaximumTest {
    SlidingWindowMaximum sol = new SlidingWindowMaximum();

    @Test void example() { assertArrayEquals(new int[]{3,3,5,5,6,7}, sol.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)); }
    @Test void single() { assertArrayEquals(new int[]{1}, sol.maxSlidingWindow(new int[]{1}, 1)); }
}
