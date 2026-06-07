package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PlusOneTest {
    private final PlusOne sol = new PlusOne();

    @Test void example() { assertArrayEquals(new int[]{1, 2, 4}, sol.plusOne(new int[]{1, 2, 3})); }
    @Test void carry() { assertArrayEquals(new int[]{1, 0, 0}, sol.plusOne(new int[]{9, 9})); }
    @Test void single() { assertArrayEquals(new int[]{1}, sol.plusOne(new int[]{0})); }
    @Test void allNines() { assertArrayEquals(new int[]{1, 0, 0, 0}, sol.plusOne(new int[]{9, 9, 9})); }
    @Test void noCarry() { assertArrayEquals(new int[]{4, 3, 2, 2}, sol.plusOne(new int[]{4, 3, 2, 1})); }
}
