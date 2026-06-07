package com.mohamdy.blind75.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock sol = new BestTimeToBuyAndSellStock();

    @Test void profit() { assertEquals(5, sol.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); }
    @Test void noProfit() { assertEquals(0, sol.maxProfit(new int[]{7, 6, 4, 3, 1})); }
}
