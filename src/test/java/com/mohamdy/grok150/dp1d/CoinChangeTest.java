package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CoinChangeTest {
    private final CoinChange sol = new CoinChange();

    @Test void example() { assertEquals(3, sol.coinChange(new int[]{1, 2, 5}, 11)); }
    @Test void impossible() { assertEquals(-1, sol.coinChange(new int[]{2}, 3)); }
    @Test void zero() { assertEquals(0, sol.coinChange(new int[]{1}, 0)); }
    @Test void exactSingleCoin() { assertEquals(1, sol.coinChange(new int[]{7}, 7)); }
    @Test void greedyTrap() { assertEquals(2, sol.coinChange(new int[]{1, 3, 4}, 6)); }
}
