package com.mohamdy.blind75.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class EditDistanceTest {
    EditDistance sol = new EditDistance();

    @Test void example() { assertEquals(3, sol.minDistance("horse", "ros")); }
    @Test void example2() { assertEquals(5, sol.minDistance("intention", "execution")); }
}
