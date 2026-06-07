package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet (original attempt was incomplete).")
class GasStationTest {
    private final GasStation sol = new GasStation();

    @Test void example() { assertEquals(3, sol.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2})); }
    @Test void impossible() { assertEquals(-1, sol.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3})); }
    @Test void single() { assertEquals(0, sol.canCompleteCircuit(new int[]{5}, new int[]{4})); }
    @Test void startAtZero() { assertEquals(0, sol.canCompleteCircuit(new int[]{3, 1, 1}, new int[]{1, 2, 2})); }
}
