package com.mohamdy.blind75.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ContainerWithMostWaterTest {
    ContainerWithMostWater sol = new ContainerWithMostWater();

    @Test void example() { assertEquals(49, sol.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); }
    @Test void two() { assertEquals(1, sol.maxArea(new int[]{1, 1})); }
}
