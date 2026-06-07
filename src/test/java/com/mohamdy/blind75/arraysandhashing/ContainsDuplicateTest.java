package com.mohamdy.blind75.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ContainsDuplicateTest {
    ContainsDuplicate sol = new ContainsDuplicate();

    @Test void hasDuplicate() { assertTrue(sol.containsDuplicate(new int[]{1, 2, 3, 1})); }
    @Test void noDuplicate() { assertFalse(sol.containsDuplicate(new int[]{1, 2, 3, 4})); }
    @Test void empty() { assertFalse(sol.containsDuplicate(new int[]{})); }
}
