package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ContainsDuplicateTest {
    private final ContainsDuplicate sol = new ContainsDuplicate();

    @Test void hasDuplicate() { assertTrue(sol.containsDuplicate(new int[]{1, 2, 3, 1})); }
    @Test void noDuplicate() { assertFalse(sol.containsDuplicate(new int[]{1, 2, 3, 4})); }
    @Test void empty() { assertFalse(sol.containsDuplicate(new int[]{})); }
    @Test void single() { assertFalse(sol.containsDuplicate(new int[]{7})); }
    @Test void allSame() { assertTrue(sol.containsDuplicate(new int[]{5, 5, 5, 5})); }
    @Test void negatives() { assertTrue(sol.containsDuplicate(new int[]{-1, -2, -3, -1})); }
    @Test void duplicateAtEnds() { assertTrue(sol.containsDuplicate(new int[]{9, 1, 2, 3, 9})); }
    @Test void largeDistinct() {
        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) { a[i] = i; }
        assertFalse(sol.containsDuplicate(a));
    }
}
