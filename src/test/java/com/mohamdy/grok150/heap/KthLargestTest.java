package com.mohamdy.grok150.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KthLargestTest {
    @Test void example() {
        KthLargest k = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4, k.add(3));
        assertEquals(5, k.add(5));
        assertEquals(5, k.add(10));
        assertEquals(8, k.add(9));
        assertEquals(8, k.add(4));
    }
    @Test void startsEmpty() {
        KthLargest k = new KthLargest(1, new int[]{});
        assertEquals(3, k.add(3));
        assertEquals(5, k.add(5));
        assertEquals(5, k.add(1));
    }
    @Test void k1TracksMax() {
        KthLargest k = new KthLargest(1, new int[]{2});
        assertEquals(2, k.add(1));
        assertEquals(7, k.add(7));
    }
}
