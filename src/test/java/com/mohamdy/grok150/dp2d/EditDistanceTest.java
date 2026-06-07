package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class EditDistanceTest {
    private final EditDistance sol = new EditDistance();

    @Test void example() { assertEquals(3, sol.minDistance("horse", "ros")); }
    @Test void example2() { assertEquals(5, sol.minDistance("intention", "execution")); }
    @Test void bothEmpty() { assertEquals(0, sol.minDistance("", "")); }
    @Test void oneEmpty() { assertEquals(3, sol.minDistance("abc", "")); }
    @Test void identical() { assertEquals(0, sol.minDistance("same", "same")); }
}
