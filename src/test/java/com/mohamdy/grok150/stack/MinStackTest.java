package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinStackTest {
    @Test void example() {
        MinStack s = new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        assertEquals(-3, s.getMin());
        s.pop();
        assertEquals(0, s.top());
        assertEquals(-2, s.getMin());
    }
    @Test void minUpdatesOnPop() {
        MinStack s = new MinStack();
        s.push(5);
        s.push(3);
        s.push(7);
        assertEquals(3, s.getMin());
        s.pop();
        s.pop();
        assertEquals(5, s.getMin());
    }
    @Test void duplicatesAtMin() {
        MinStack s = new MinStack();
        s.push(2);
        s.push(2);
        s.push(1);
        s.pop();
        assertEquals(2, s.getMin());
        s.pop();
        assertEquals(2, s.getMin());
    }
}
