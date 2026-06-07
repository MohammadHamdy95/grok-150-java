package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class HouseRobberTest {
    HouseRobber sol = new HouseRobber();

    @Test void example() { assertEquals(4, sol.rob(new int[]{1, 2, 3, 1})); }
    @Test void example2() { assertEquals(12, sol.rob(new int[]{2, 7, 9, 3, 1})); }
}
