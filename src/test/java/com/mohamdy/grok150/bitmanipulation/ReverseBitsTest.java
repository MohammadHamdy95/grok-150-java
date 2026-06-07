package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseBitsTest {
    ReverseBits sol = new ReverseBits();

    @Test void example() { assertEquals(964176192, sol.reverseBits(43261596)); }
}
