package com.mohamdy.blind75.uncategorized;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinLengthTest {
    // Non-standard problem: counts a running stack where 'B' cancels a prior unit, else pushes.
    @Test void example() { assertEquals(1, MinLength.getMinLength("BABBA")); }
    // "BBB": empty stack pushes B(1), next B cancels(0), last B pushes(1) -> 1
    @Test void allB() { assertEquals(1, MinLength.getMinLength("BBB")); }
    @Test void allA() { assertEquals(3, MinLength.getMinLength("AAA")); }
    @Test void empty() { assertEquals(0, MinLength.getMinLength("")); }
}
