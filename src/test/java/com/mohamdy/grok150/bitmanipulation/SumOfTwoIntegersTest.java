package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SumOfTwoIntegersTest {
    private final SumOfTwoIntegers sol = new SumOfTwoIntegers();

    @Test void example() { assertEquals(3, sol.getSum(1, 2)); }
    @Test void negativeAndPositive() { assertEquals(1, sol.getSum(2, -1)); }
    @Test void bothNegative() { assertEquals(-8, sol.getSum(-3, -5)); }
    @Test void withZero() { assertEquals(7, sol.getSum(7, 0)); }
    @Test void cancelOut() { assertEquals(0, sol.getSum(5, -5)); }
}
