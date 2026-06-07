package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SubsetsTest {
    private final Subsets sol = new Subsets();

    @Test void example() {
        assertEquals(canon(List.of(List.of(), List.of(1), List.of(2), List.of(3),
                List.of(1, 2), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3))),
                canon(sol.subsets(new int[]{1, 2, 3})));
    }
    @Test void single() { assertEquals(canon(List.of(List.of(), List.of(0))), canon(sol.subsets(new int[]{0}))); }
    @Test void countOnly() { assertEquals(16, sol.subsets(new int[]{1, 2, 3, 4}).size()); }
}
