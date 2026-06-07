package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SingleNumberTest {
    private final SingleNumber sol = new SingleNumber();

    @Test void example() { assertEquals(1, sol.singleNumber(new int[]{2, 2, 1})); }
    @Test void example2() { assertEquals(4, sol.singleNumber(new int[]{4, 1, 2, 1, 2})); }
    @Test void single() { assertEquals(7, sol.singleNumber(new int[]{7})); }
    @Test void negatives() { assertEquals(-3, sol.singleNumber(new int[]{-3, 5, 5})); }
    @Test void zeroIsSingle() { assertEquals(0, sol.singleNumber(new int[]{1, 0, 1})); }
}
