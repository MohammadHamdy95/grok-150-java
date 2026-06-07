package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CarFleetTest {
    private final CarFleet sol = new CarFleet();

    @Test void example() { assertEquals(3, sol.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3})); }
    @Test void single() { assertEquals(1, sol.carFleet(10, new int[]{3}, new int[]{3})); }
    @Test void allMerge() { assertEquals(1, sol.carFleet(10, new int[]{0, 4, 2}, new int[]{2, 1, 3})); }
    @Test void noneMerge() { assertEquals(2, sol.carFleet(10, new int[]{8, 3}, new int[]{1, 1})); }
    @Test void empty() { assertEquals(0, sol.carFleet(10, new int[]{}, new int[]{})); }
}
