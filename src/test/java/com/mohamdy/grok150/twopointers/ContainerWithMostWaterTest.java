package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ContainerWithMostWaterTest {
    private final ContainerWithMostWater sol = new ContainerWithMostWater();

    @Test void example() { assertEquals(49, sol.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); }
    @Test void two() { assertEquals(1, sol.maxArea(new int[]{1, 1})); }
    @Test void increasing() { assertEquals(6, sol.maxArea(new int[]{1, 2, 3, 4, 5})); }
    @Test void tallEnds() { assertEquals(20, sol.maxArea(new int[]{10, 1, 1, 1, 10})); }
    @Test void plateau() { assertEquals(16, sol.maxArea(new int[]{4, 4, 4, 4, 4})); }
}
