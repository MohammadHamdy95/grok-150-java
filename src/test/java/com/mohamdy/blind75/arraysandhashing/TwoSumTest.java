package com.mohamdy.blind75.arraysandhashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum sol = new TwoSum();

    @Test void exampleOne() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{2, 7, 11, 15}, 9)); }
    @Test void exampleTwo() { assertArrayEquals(new int[]{1, 2}, sol.twoSum(new int[]{3, 2, 4}, 6)); }
    @Test void duplicates() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{3, 3}, 6)); }
    @Test void noAnswer() { assertNull(sol.twoSum(new int[]{1, 2, 3}, 100)); }
}
