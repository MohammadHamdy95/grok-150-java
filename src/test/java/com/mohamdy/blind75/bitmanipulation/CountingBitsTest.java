package com.mohamdy.blind75.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CountingBitsTest {
    CountingBits sol = new CountingBits();

    @Test void example() { assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, sol.countBits(5)); }
    @Test void zero() { assertArrayEquals(new int[]{0}, sol.countBits(0)); }
}
