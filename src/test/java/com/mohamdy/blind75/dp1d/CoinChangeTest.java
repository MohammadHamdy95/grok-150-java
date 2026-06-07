package com.mohamdy.blind75.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CoinChangeTest {
    CoinChange sol = new CoinChange();

    @Test void example() { assertEquals(3, sol.coinChange(new int[]{1, 2, 5}, 11)); }
    @Test void impossible() { assertEquals(-1, sol.coinChange(new int[]{2}, 3)); }
    @Test void zero() { assertEquals(0, sol.coinChange(new int[]{1}, 0)); }
}
