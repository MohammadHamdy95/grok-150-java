package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BestTimeToBuyAndSellStockTest {
    private final BestTimeToBuyAndSellStock sol = new BestTimeToBuyAndSellStock();

    @Test void profit() { assertEquals(5, sol.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); }
    @Test void noProfit() { assertEquals(0, sol.maxProfit(new int[]{7, 6, 4, 3, 1})); }
    @Test void single() { assertEquals(0, sol.maxProfit(new int[]{5})); }
    @Test void increasing() { assertEquals(4, sol.maxProfit(new int[]{1, 2, 3, 4, 5})); }
    @Test void dipThenPeak() { assertEquals(8, sol.maxProfit(new int[]{3, 2, 1, 4, 9})); }
    @Test void empty() { assertEquals(0, sol.maxProfit(new int[]{})); }
}
