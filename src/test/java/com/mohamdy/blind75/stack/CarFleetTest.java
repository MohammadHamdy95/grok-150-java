package com.mohamdy.blind75.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CarFleetTest {
    CarFleet sol = new CarFleet();

    @Test void example() { assertEquals(3, sol.carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3})); }
    @Test void single() { assertEquals(1, sol.carFleet(10, new int[]{3}, new int[]{3})); }
}
