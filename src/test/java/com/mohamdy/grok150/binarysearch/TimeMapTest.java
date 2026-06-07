package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
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
    @Test void beforeFirstTimestamp() {
        TimeMap tm = new TimeMap();
        tm.set("a", "x", 5);
        assertEquals("", tm.get("a", 1));
    }
    @Test void missingKey() {
        TimeMap tm = new TimeMap();
        assertEquals("", tm.get("nope", 1));
    }
    @Test void multipleKeys() {
        TimeMap tm = new TimeMap();
        tm.set("a", "1", 1);
        tm.set("b", "2", 1);
        assertEquals("1", tm.get("a", 9));
        assertEquals("2", tm.get("b", 9));
    }
}
