package com.mohamdy.blind75.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KthLargestElementInAnArrayTest {
    KthLargestElementInAnArray sol = new KthLargestElementInAnArray();

    @Test void example() { assertEquals(5, sol.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); }
    @Test void example2() { assertEquals(4, sol.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); }
}
