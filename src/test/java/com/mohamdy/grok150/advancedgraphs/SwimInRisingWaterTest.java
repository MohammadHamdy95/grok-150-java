package com.mohamdy.grok150.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SwimInRisingWaterTest {
    private final SwimInRisingWater sol = new SwimInRisingWater();

    @Test void example() { assertEquals(3, sol.swimInWater(new int[][]{{0, 2}, {1, 3}})); }
    @Test void larger() {
        assertEquals(16, sol.swimInWater(new int[][]{
            {0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16},
            {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}}));
    }
    @Test void single() { assertEquals(0, sol.swimInWater(new int[][]{{0}})); }
}
