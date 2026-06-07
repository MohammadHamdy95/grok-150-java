package com.mohamdy.blind75.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LastStoneWeightTest {
    LastStoneWeight sol = new LastStoneWeight();

    @Test void example() { assertEquals(1, sol.lastStoneWeight(new int[]{2,7,4,1,8,1})); }
    @Test void single() { assertEquals(1, sol.lastStoneWeight(new int[]{1})); }
}
