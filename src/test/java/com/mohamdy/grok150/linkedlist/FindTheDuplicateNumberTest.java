package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class FindTheDuplicateNumberTest {
    FindTheDuplicateNumber sol = new FindTheDuplicateNumber();

    @Test void example() { assertEquals(2, sol.findDuplicate(new int[]{1,3,4,2,2})); }
    @Test void example2() { assertEquals(3, sol.findDuplicate(new int[]{3,1,3,4,2})); }
}
