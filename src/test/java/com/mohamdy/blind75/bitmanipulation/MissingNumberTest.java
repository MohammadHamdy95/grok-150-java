package com.mohamdy.blind75.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MissingNumberTest {
    MissingNumber sol = new MissingNumber();

    @Test void example() { assertEquals(2, sol.missingNumber(new int[]{3, 0, 1})); }
    @Test void example2() { assertEquals(8, sol.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); }
    @Test void single() { assertEquals(0, sol.missingNumber(new int[]{1})); }
}
