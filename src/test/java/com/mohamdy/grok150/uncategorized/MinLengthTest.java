package com.mohamdy.grok150.uncategorized;

import org.junit.jupiter.api.Test;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

class MinLengthTest {
    // Non-standard problem: 'A' always pushes; 'B' pops if the stack is non-empty, else pushes.
    @Test void example() { assertEquals(1, MinLength.getMinLength("BABBA")); }
    @Test void allB() { assertEquals(1, MinLength.getMinLength("BBB")); }
    @Test void allA() { assertEquals(3, MinLength.getMinLength("AAA")); }
    @Test void empty() { assertEquals(0, MinLength.getMinLength("")); }
    @Test void pair() { assertEquals(0, MinLength.getMinLength("AB")); }
    @Test void balanced() { assertEquals(0, MinLength.getMinLength("AABB")); }
    @Test void alternating() { assertEquals(0, MinLength.getMinLength("ABABAB")); }
    @Test void leftover() { assertEquals(1, MinLength.getMinLength("AAB")); }
}
