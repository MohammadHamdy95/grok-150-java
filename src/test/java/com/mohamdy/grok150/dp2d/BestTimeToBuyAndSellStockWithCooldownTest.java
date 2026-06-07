package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BestTimeToBuyAndSellStockWithCooldownTest {
    BestTimeToBuyAndSellStockWithCooldown sol = new BestTimeToBuyAndSellStockWithCooldown();

    @Test void example() { assertEquals(3, sol.maxProfit(new int[]{1,2,3,0,2})); }
    @Test void single() { assertEquals(0, sol.maxProfit(new int[]{1})); }
}
