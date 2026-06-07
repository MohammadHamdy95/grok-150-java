package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NQueensTest {
    private final NQueens sol = new NQueens();

    @Test void four() { assertEquals(2, sol.solveNQueens(4).size()); }
    @Test void one() { assertEquals(1, sol.solveNQueens(1).size()); }
    @Test void twoAndThreeImpossible() {
        assertEquals(0, sol.solveNQueens(2).size());
        assertEquals(0, sol.solveNQueens(3).size());
    }
    @Test void eight() { assertEquals(92, sol.solveNQueens(8).size()); }
}
