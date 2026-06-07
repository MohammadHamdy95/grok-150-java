package com.mohamdy.grok150.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LastStoneWeightTest {
    private final LastStoneWeight sol = new LastStoneWeight();

    @Test void example() { assertEquals(1, sol.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1})); }
    @Test void single() { assertEquals(3, sol.lastStoneWeight(new int[]{3})); }
    @Test void twoEqual() { assertEquals(0, sol.lastStoneWeight(new int[]{5, 5})); }
    @Test void twoDifferent() { assertEquals(2, sol.lastStoneWeight(new int[]{3, 5})); }
    @Test void allCancel() { assertEquals(0, sol.lastStoneWeight(new int[]{2, 2, 4, 4})); }
}
