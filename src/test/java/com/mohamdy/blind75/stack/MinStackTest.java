package com.mohamdy.blind75.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
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
}
