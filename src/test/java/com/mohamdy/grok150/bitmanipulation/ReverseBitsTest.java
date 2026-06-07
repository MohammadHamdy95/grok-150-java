package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseBitsTest {
    private final ReverseBits sol = new ReverseBits();

    @Test void example() { assertEquals(964176192, sol.reverseBits(43261596)); }
    @Test void allOnes() { assertEquals(-1, sol.reverseBits(-1)); }
    @Test void zero() { assertEquals(0, sol.reverseBits(0)); }
    @Test void one() { assertEquals(-2147483648, sol.reverseBits(1)); }
}
