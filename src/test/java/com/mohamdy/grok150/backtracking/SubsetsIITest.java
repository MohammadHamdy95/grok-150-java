package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SubsetsIITest {
    private final SubsetsII sol = new SubsetsII();

    @Test void example() {
        assertEquals(canon(List.of(List.of(), List.of(1), List.of(2), List.of(1, 2),
                List.of(2, 2), List.of(1, 2, 2))),
                canon(sol.subsetsWithDup(new int[]{1, 2, 2})));
    }
    @Test void allSame() {
        assertEquals(canon(List.of(List.of(), List.of(0), List.of(0, 0))),
                canon(sol.subsetsWithDup(new int[]{0, 0})));
    }
    @Test void distinct() { assertEquals(4, sol.subsetsWithDup(new int[]{1, 2}).size()); }
}
