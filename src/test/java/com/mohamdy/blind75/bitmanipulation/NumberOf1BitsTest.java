package com.mohamdy.blind75.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NumberOf1BitsTest {
    NumberOf1Bits sol = new NumberOf1Bits();

    @Test void example() { assertEquals(3, sol.hammingWeight(11)); }
    @Test void zero() { assertEquals(0, sol.hammingWeight(0)); }
    @Test void one() { assertEquals(1, sol.hammingWeight(128)); }
}
