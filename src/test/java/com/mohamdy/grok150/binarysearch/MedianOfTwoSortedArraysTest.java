package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MedianOfTwoSortedArraysTest {
    private final MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();

    @Test void odd() { assertEquals(2.0, sol.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 1e-9); }
    @Test void even() { assertEquals(2.5, sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 1e-9); }
    @Test void oneEmpty() { assertEquals(2.0, sol.findMedianSortedArrays(new int[]{}, new int[]{2}), 1e-9); }
    @Test void disjoint() { assertEquals(3.5, sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{5, 6}), 1e-9); }
    @Test void negatives() { assertEquals(0.0, sol.findMedianSortedArrays(new int[]{-5, 0}, new int[]{0, 5}), 1e-9); }
}
