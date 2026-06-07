package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LRUCacheTest {
    @Test void example() {
        LRUCache c = new LRUCache(2);
        c.put(1, 1);
        c.put(2, 2);
        assertEquals(1, c.get(1));
        c.put(3, 3);            // evicts key 2
        assertEquals(-1, c.get(2));
        c.put(4, 4);            // evicts key 1
        assertEquals(-1, c.get(1));
        assertEquals(3, c.get(3));
        assertEquals(4, c.get(4));
    }
    @Test void updateExistingKey() {
        LRUCache c = new LRUCache(2);
        c.put(1, 1);
        c.put(1, 10);
        assertEquals(10, c.get(1));
    }
    @Test void getRefreshesRecency() {
        LRUCache c = new LRUCache(2);
        c.put(1, 1);
        c.put(2, 2);
        assertEquals(1, c.get(1)); // 1 is now most-recent
        c.put(3, 3);               // evicts 2, not 1
        assertEquals(1, c.get(1));
        assertEquals(-1, c.get(2));
    }
    @Test void capacityOne() {
        LRUCache c = new LRUCache(1);
        c.put(1, 1);
        c.put(2, 2);
        assertEquals(-1, c.get(1));
        assertEquals(2, c.get(2));
    }
}
