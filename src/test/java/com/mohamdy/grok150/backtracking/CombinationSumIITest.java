package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CombinationSumIITest {
    private final CombinationSumII sol = new CombinationSumII();

    @Test void example() {
        assertEquals(canon(List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6))),
                canon(sol.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8)));
    }
    @Test void example2() {
        assertEquals(canon(List.of(List.of(1, 2, 2), List.of(5))),
                canon(sol.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5)));
    }
    @Test void none() { assertTrue(sol.combinationSum2(new int[]{3, 4}, 2).isEmpty()); }
}
