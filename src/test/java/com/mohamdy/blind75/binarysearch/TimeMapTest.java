package com.mohamdy.blind75.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TimeMapTest {
    @Test void example() {
        TimeMap tm = new TimeMap();
        tm.set("foo", "bar", 1);
        assertEquals("bar", tm.get("foo", 1));
        assertEquals("bar", tm.get("foo", 3));
        tm.set("foo", "bar2", 4);
        assertEquals("bar2", tm.get("foo", 4));
        assertEquals("bar2", tm.get("foo", 5));
    }
}
