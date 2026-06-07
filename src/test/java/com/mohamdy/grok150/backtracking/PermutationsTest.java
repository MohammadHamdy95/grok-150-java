package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PermutationsTest {
    Permutations sol = new Permutations();

    @Test void example() { assertEquals(6, sol.permute(new int[]{1,2,3}).size()); }
    @Test void two() { assertEquals(2, sol.permute(new int[]{0,1}).size()); }
}
