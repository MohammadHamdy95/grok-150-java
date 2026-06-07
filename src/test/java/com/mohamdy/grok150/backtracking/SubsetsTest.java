package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SubsetsTest {
    Subsets sol = new Subsets();

    @Test void example() { assertEquals(8, sol.subsets(new int[]{1,2,3}).size()); }
    @Test void single() { assertEquals(2, sol.subsets(new int[]{0}).size()); }
}
