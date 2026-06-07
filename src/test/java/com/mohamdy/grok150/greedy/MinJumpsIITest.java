package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinJumpsIITest {
    MinJumpsII sol = new MinJumpsII();

    @Test void example() { assertEquals(2, sol.jump(new int[]{2, 3, 1, 1, 4})); }
    @Test void example2() { assertEquals(2, sol.jump(new int[]{2, 3, 0, 1, 4})); }
    @Test void single() { assertEquals(0, sol.jump(new int[]{0})); }
}
