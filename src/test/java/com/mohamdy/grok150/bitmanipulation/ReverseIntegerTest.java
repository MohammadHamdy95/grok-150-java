package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseIntegerTest {
    private final ReverseInteger sol = new ReverseInteger();

    @Test void positive() { assertEquals(321, sol.reverse(123)); }
    @Test void negative() { assertEquals(-321, sol.reverse(-123)); }
    @Test void trailingZero() { assertEquals(21, sol.reverse(120)); }
    @Test void overflow() { assertEquals(0, sol.reverse(1534236469)); }
    @Test void underflow() { assertEquals(0, sol.reverse(-2147483648)); }
    @Test void zero() { assertEquals(0, sol.reverse(0)); }
}
