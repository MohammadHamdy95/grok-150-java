package com.mohamdy.blind75.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();

    @Test void odd() { assertEquals(2.0, sol.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), 1e-9); }
    @Test void even() { assertEquals(2.5, sol.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), 1e-9); }
}
