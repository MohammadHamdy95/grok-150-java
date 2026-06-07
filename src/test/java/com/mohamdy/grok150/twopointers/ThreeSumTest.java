package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ThreeSumTest {
    ThreeSum sol = new ThreeSum();

    @Test void example() {
        // expected: [[-1, -1, 2], [-1, 0, 1]]
        assertEquals(2, sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).size());
    }

    @Test void allZeros() { assertEquals(1, sol.threeSum(new int[]{0, 0, 0}).size()); }
    @Test void noTriplet() { assertEquals(0, sol.threeSum(new int[]{1, 2, 3}).size()); }
}
