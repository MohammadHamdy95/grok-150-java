package com.mohamdy.grok150.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MedianFinderTest {
    @Test void example() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        assertEquals(1.5, mf.findMedian(), 1e-9);
        mf.addNum(3);
        assertEquals(2.0, mf.findMedian(), 1e-9);
    }
    @Test void single() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(5);
        assertEquals(5.0, mf.findMedian(), 1e-9);
    }
    @Test void descendingInserts() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(5);
        mf.addNum(4);
        mf.addNum(3);
        mf.addNum(2);
        mf.addNum(1);
        assertEquals(3.0, mf.findMedian(), 1e-9);
    }
    @Test void negatives() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(-1);
        mf.addNum(-2);
        assertEquals(-1.5, mf.findMedian(), 1e-9);
    }
}
