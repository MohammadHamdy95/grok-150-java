package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BestTimeToBuyAndSellStockWithCooldownTest {
    private final BestTimeToBuyAndSellStockWithCooldown sol = new BestTimeToBuyAndSellStockWithCooldown();

    @Test void example() { assertEquals(3, sol.maxProfit(new int[]{1, 2, 3, 0, 2})); }
    @Test void single() { assertEquals(0, sol.maxProfit(new int[]{1})); }
    @Test void decreasing() { assertEquals(0, sol.maxProfit(new int[]{5, 4, 3, 2, 1})); }
    @Test void increasing() { assertEquals(4, sol.maxProfit(new int[]{1, 2, 3, 4, 5})); }
}
