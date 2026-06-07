package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSum sol = new TwoSum();

    @Test void exampleOne() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{2, 7, 11, 15}, 9)); }
    @Test void exampleTwo() { assertArrayEquals(new int[]{1, 2}, sol.twoSum(new int[]{3, 2, 4}, 6)); }
    @Test void duplicates() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{3, 3}, 6)); }
    @Test void negatives() { assertArrayEquals(new int[]{2, 4}, sol.twoSum(new int[]{-1, -2, -3, -4, -5}, -8)); }
    @Test void withZeroes() { assertArrayEquals(new int[]{0, 3}, sol.twoSum(new int[]{0, 4, 3, 0}, 0)); }
    @Test void noAnswer() { assertNull(sol.twoSum(new int[]{1, 2, 3}, 7)); }
}
