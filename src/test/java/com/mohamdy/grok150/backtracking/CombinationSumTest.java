package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CombinationSumTest {
    private final CombinationSum sol = new CombinationSum();

    @Test void example() {
        assertEquals(canon(List.of(List.of(2, 2, 3), List.of(7))),
                canon(sol.combinationSum(new int[]{2, 3, 6, 7}, 7)));
    }
    @Test void multiple() {
        assertEquals(canon(List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5))),
                canon(sol.combinationSum(new int[]{2, 3, 5}, 8)));
    }
    @Test void none() { assertTrue(sol.combinationSum(new int[]{2}, 1).isEmpty()); }
    @Test void exactSingle() { assertEquals(canon(List.of(List.of(1, 1))), canon(sol.combinationSum(new int[]{1}, 2))); }
}
