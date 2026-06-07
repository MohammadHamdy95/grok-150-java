package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BurstBalloonsTest {
    BurstBalloons sol = new BurstBalloons();

    @Test void example() { assertEquals(167, sol.maxCoins(new int[]{3,1,5,8})); }
    @Test void two() { assertEquals(10, sol.maxCoins(new int[]{1,5})); }
}
