package com.mohamdy.blind75.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
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
}
