package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class AddTwoNumbersTest {
    AddTwoNumbers sol = new AddTwoNumbers();

    @Test void example() {
        // 342 + 465 = 807 -> stored reversed as 7 -> 0 -> 8
        assertArrayEquals(new int[]{7,0,8}, ListNodes.toArray(sol.addTwoNumbers(ListNodes.of(2,4,3), ListNodes.of(5,6,4))));
    }
}
