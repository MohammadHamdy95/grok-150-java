package com.mohamdy.blind75.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TopKFrequentElementsTest {
    TopKFrequentElements sol = new TopKFrequentElements();

    @Test void example() {
        // expected (order-independent): {1, 2}
        assertEquals(2, sol.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2).length);
    }

    @Test void singleElement() {
        assertArrayEquals(new int[]{1}, sol.topKFrequent(new int[]{1}, 1));
    }
}
