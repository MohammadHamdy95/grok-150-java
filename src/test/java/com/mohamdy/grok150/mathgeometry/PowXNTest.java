package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PowXNTest {
    private final PowXN sol = new PowXN();

    @Test void example() { assertEquals(1024.0, sol.myPow(2.0, 10), 1e-9); }
    @Test void fractional() { assertEquals(9.261, sol.myPow(2.1, 3), 1e-3); }
    @Test void negativeExp() { assertEquals(0.25, sol.myPow(2.0, -2), 1e-9); }
    @Test void zeroExp() { assertEquals(1.0, sol.myPow(5.0, 0), 1e-9); }
    @Test void one() { assertEquals(1.0, sol.myPow(1.0, 2147483647), 1e-9); }
}
