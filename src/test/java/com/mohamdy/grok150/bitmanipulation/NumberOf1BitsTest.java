package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NumberOf1BitsTest {
    private final NumberOf1Bits sol = new NumberOf1Bits();

    @Test void example() { assertEquals(3, sol.hammingWeight(11)); }
    @Test void zero() { assertEquals(0, sol.hammingWeight(0)); }
    @Test void powerOfTwo() { assertEquals(1, sol.hammingWeight(128)); }
    @Test void allOnesByte() { assertEquals(8, sol.hammingWeight(255)); }
    @Test void maxInt() { assertEquals(31, sol.hammingWeight(Integer.MAX_VALUE)); }
}
