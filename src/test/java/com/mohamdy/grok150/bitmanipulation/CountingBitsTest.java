package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CountingBitsTest {
    private final CountingBits sol = new CountingBits();

    @Test void example() { assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, sol.countBits(5)); }
    @Test void zero() { assertArrayEquals(new int[]{0}, sol.countBits(0)); }
    @Test void two() { assertArrayEquals(new int[]{0, 1, 1}, sol.countBits(2)); }
    @Test void eight() { assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}, sol.countBits(8)); }
}
