package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinJumpsIITest {
    private final MinJumpsII sol = new MinJumpsII();

    @Test void example() { assertEquals(2, sol.jump(new int[]{2, 3, 1, 1, 4})); }
    @Test void example2() { assertEquals(2, sol.jump(new int[]{2, 3, 0, 1, 4})); }
    @Test void single() { assertEquals(0, sol.jump(new int[]{0})); }
    @Test void allOnes() { assertEquals(3, sol.jump(new int[]{1, 1, 1, 1})); }
    @Test void twoElements() { assertEquals(1, sol.jump(new int[]{2, 1})); }
    @Test void longer() { assertEquals(3, sol.jump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0})); }
}
