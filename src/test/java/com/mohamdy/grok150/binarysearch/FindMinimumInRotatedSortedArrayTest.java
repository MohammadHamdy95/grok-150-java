package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class FindMinimumInRotatedSortedArrayTest {
    private final FindMinimumInRotatedSortedArray sol = new FindMinimumInRotatedSortedArray();

    @Test void example() { assertEquals(1, sol.findMin(new int[]{3, 4, 5, 1, 2})); }
    @Test void example2() { assertEquals(0, sol.findMin(new int[]{4, 5, 6, 7, 0, 1, 2})); }
    @Test void notRotated() { assertEquals(11, sol.findMin(new int[]{11, 13, 15, 17})); }
    @Test void single() { assertEquals(1, sol.findMin(new int[]{1})); }
    @Test void two() { assertEquals(1, sol.findMin(new int[]{2, 1})); }
    @Test void rotateByOne() { assertEquals(1, sol.findMin(new int[]{2, 3, 4, 5, 1})); }
}
