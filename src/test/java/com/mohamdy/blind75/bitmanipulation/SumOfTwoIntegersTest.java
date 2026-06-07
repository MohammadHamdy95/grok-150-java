package com.mohamdy.blind75.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SumOfTwoIntegersTest {
    SumOfTwoIntegers sol = new SumOfTwoIntegers();

    @Test void example() { assertEquals(3, sol.getSum(1, 2)); }
    @Test void negative() { assertEquals(1, sol.getSum(2, -1)); }
}
