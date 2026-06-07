package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CoinChangeIITest {
    private final CoinChangeII sol = new CoinChangeII();

    @Test void example() { assertEquals(4, sol.change(5, new int[]{1, 2, 5})); }
    @Test void impossible() { assertEquals(0, sol.change(3, new int[]{2})); }
    @Test void zeroAmount() { assertEquals(1, sol.change(0, new int[]{1, 2})); }
    @Test void singleCoin() { assertEquals(1, sol.change(10, new int[]{10})); }
    @Test void noCoins() { assertEquals(0, sol.change(7, new int[]{})); }
}
