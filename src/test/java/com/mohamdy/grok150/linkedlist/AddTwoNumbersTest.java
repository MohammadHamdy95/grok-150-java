package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

//@Disabled("Solution not implemented yet.")
@Disabled("Solution not implemented yet.")
class AddTwoNumbersTest {
    private final AddTwoNumbers sol = new AddTwoNumbers();

    @Test void example() { assertArrayEquals(new int[]{7, 0, 8}, ListNodes.toArray(sol.addTwoNumbers(ListNodes.of(2, 4, 3), ListNodes.of(5, 6, 4)))); }
    @Test void zeros() { assertArrayEquals(new int[]{0}, ListNodes.toArray(sol.addTwoNumbers(ListNodes.of(0), ListNodes.of(0)))); }
    @Test void carryCascade() { assertArrayEquals(new int[]{0, 0, 0, 1}, ListNodes.toArray(sol.addTwoNumbers(ListNodes.of(9, 9, 9), ListNodes.of(1)))); }
    @Test void differentLengths() { assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, ListNodes.toArray(sol.addTwoNumbers(ListNodes.of(9, 9, 9, 9, 9, 9, 9), ListNodes.of(9, 9, 9, 9)))); }
}
