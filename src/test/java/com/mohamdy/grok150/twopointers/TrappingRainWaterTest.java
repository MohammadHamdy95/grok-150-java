package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TrappingRainWaterTest {
    TrappingRainWater sol = new TrappingRainWater();

    @Test void example() { assertEquals(6, sol.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); }
    @Test void example2() { assertEquals(9, sol.trap(new int[]{4,2,0,3,2,5})); }
}
