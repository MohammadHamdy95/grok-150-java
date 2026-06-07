package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray sol = new FindMinimumInRotatedSortedArray();

    @Test void example() { assertEquals(1, sol.findMin(new int[]{3, 4, 5, 1, 2})); }
    @Test void example2() { assertEquals(0, sol.findMin(new int[]{4, 5, 6, 7, 0, 1, 2})); }
    @Test void single() { assertEquals(1, sol.findMin(new int[]{1})); }
}
