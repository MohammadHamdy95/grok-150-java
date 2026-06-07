package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MissingNumberTest {
    private final MissingNumber sol = new MissingNumber();

    @Test void example() { assertEquals(2, sol.missingNumber(new int[]{3, 0, 1})); }
    @Test void missingLast() { assertEquals(2, sol.missingNumber(new int[]{0, 1})); }
    @Test void longer() { assertEquals(8, sol.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); }
    @Test void missingZero() { assertEquals(0, sol.missingNumber(new int[]{1})); }
    @Test void singleZeroPresent() { assertEquals(1, sol.missingNumber(new int[]{0})); }
}
