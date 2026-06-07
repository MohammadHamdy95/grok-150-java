package com.mohamdy.blind75.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseIntegerTest {
    ReverseInteger sol = new ReverseInteger();

    @Test void positive() { assertEquals(321, sol.reverse(123)); }
    @Test void negative() { assertEquals(-321, sol.reverse(-123)); }
    @Test void overflow() { assertEquals(0, sol.reverse(1534236469)); }
}
