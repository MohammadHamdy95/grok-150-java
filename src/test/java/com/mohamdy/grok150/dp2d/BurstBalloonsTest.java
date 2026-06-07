package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BurstBalloonsTest {
    private final BurstBalloons sol = new BurstBalloons();

    @Test void example() { assertEquals(167, sol.maxCoins(new int[]{3, 1, 5, 8})); }
    @Test void two() { assertEquals(10, sol.maxCoins(new int[]{1, 5})); }
    @Test void single() { assertEquals(5, sol.maxCoins(new int[]{5})); }
    @Test void uniform() { assertEquals(8, sol.maxCoins(new int[]{2, 2})); }
}
