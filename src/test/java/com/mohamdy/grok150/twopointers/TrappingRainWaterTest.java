package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TrappingRainWaterTest {
    private final TrappingRainWater sol = new TrappingRainWater();

    @Test void example() { assertEquals(6, sol.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})); }
    @Test void example2() { assertEquals(9, sol.trap(new int[]{4, 2, 0, 3, 2, 5})); }
    @Test void empty() { assertEquals(0, sol.trap(new int[]{})); }
    @Test void monotonic() { assertEquals(0, sol.trap(new int[]{1, 2, 3, 4})); }
    @Test void valley() { assertEquals(10, sol.trap(new int[]{3, 0, 0, 2, 0, 4})); }
    @Test void flat() { assertEquals(0, sol.trap(new int[]{2, 2, 2})); }
}
