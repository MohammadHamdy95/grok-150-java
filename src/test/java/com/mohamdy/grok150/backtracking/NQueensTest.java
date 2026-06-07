package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NQueensTest {
    NQueens sol = new NQueens();

    @Test void four() { assertEquals(2, sol.solveNQueens(4).size()); }
    @Test void one() { assertEquals(1, sol.solveNQueens(1).size()); }
}
