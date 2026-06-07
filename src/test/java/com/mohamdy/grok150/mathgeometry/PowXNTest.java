package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PowXNTest {
    PowXN sol = new PowXN();

    @Test void example() { assertEquals(1024.0, sol.myPow(2.0, 10), 1e-9); }
    @Test void negativeExp() { assertEquals(0.25, sol.myPow(2.0, -2), 1e-9); }
}
