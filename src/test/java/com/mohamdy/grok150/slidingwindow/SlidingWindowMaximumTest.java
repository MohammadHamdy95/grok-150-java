package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SlidingWindowMaximumTest {
    private final SlidingWindowMaximum sol = new SlidingWindowMaximum();

    @Test void example() { assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, sol.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)); }
    @Test void single() { assertArrayEquals(new int[]{1}, sol.maxSlidingWindow(new int[]{1}, 1)); }
    @Test void windowOne() { assertArrayEquals(new int[]{4, 2, 12, 11}, sol.maxSlidingWindow(new int[]{4, 2, 12, 11}, 1)); }
    @Test void wholeArray() { assertArrayEquals(new int[]{9}, sol.maxSlidingWindow(new int[]{1, 9, 3}, 3)); }
    @Test void decreasing() { assertArrayEquals(new int[]{5, 4, 3}, sol.maxSlidingWindow(new int[]{5, 4, 3, 2}, 2)); }
}
