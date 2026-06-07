package com.mohamdy.blind75.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CoinChangeIITest {
    CoinChangeII sol = new CoinChangeII();

    @Test void example() { assertEquals(4, sol.change(5, new int[]{1,2,5})); }
    @Test void impossible() { assertEquals(0, sol.change(3, new int[]{2})); }
}
