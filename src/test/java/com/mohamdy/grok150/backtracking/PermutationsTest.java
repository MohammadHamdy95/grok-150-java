package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PermutationsTest {
    private final Permutations sol = new Permutations();

    @Test void example() {
        assertEquals(canon(List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3),
                List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1))),
                canon(sol.permute(new int[]{1, 2, 3})));
    }
    @Test void two() { assertEquals(canon(List.of(List.of(0, 1), List.of(1, 0))), canon(sol.permute(new int[]{0, 1}))); }
    @Test void single() { assertEquals(canon(List.of(List.of(1))), canon(sol.permute(new int[]{1}))); }
    @Test void countOnly() { assertEquals(24, sol.permute(new int[]{1, 2, 3, 4}).size()); }
}
