package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class FindTheDuplicateNumberTest {
    private final FindTheDuplicateNumber sol = new FindTheDuplicateNumber();

    @Test void example() { assertEquals(2, sol.findDuplicate(new int[]{1, 3, 4, 2, 2})); }
    @Test void example2() { assertEquals(3, sol.findDuplicate(new int[]{3, 1, 3, 4, 2})); }
    @Test void repeatedManyTimes() { assertEquals(2, sol.findDuplicate(new int[]{2, 2, 2, 2, 2})); }
    @Test void twoElements() { assertEquals(1, sol.findDuplicate(new int[]{1, 1})); }
    @Test void duplicateIsMax() { assertEquals(4, sol.findDuplicate(new int[]{1, 2, 3, 4, 4})); }
}
