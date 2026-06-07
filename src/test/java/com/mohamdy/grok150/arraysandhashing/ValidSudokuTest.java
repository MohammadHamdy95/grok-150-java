package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidSudokuTest {
    private final ValidSudoku sol = new ValidSudoku();

    private char[][] grid(String... rows) {
        char[][] b = new char[9][9];
        for (int r = 0; r < 9; r++) { for (int c = 0; c < 9; c++) { b[r][c] = rows[r].charAt(c); } }
        return b;
    }

    @Test void validBoard() {
        assertTrue(sol.isValidSudoku(grid(
            "53..7....", "6..195...", ".98....6.",
            "8...6...3", "4..8.3..1", "7...2...6",
            ".6....28.", "...419..5", "....8..79")));
    }
    @Test void emptyBoard() {
        assertTrue(sol.isValidSudoku(grid(
            ".........", ".........", ".........",
            ".........", ".........", ".........",
            ".........", ".........", ".........")));
    }
    @Test void duplicateInColumn() {
        assertFalse(sol.isValidSudoku(grid(
            "83..7....", "6..195...", ".98....6.",
            "8...6...3", "4..8.3..1", "7...2...6",
            ".6....28.", "...419..5", "....8..79")));
    }
    @Test void duplicateInBox() {
        assertFalse(sol.isValidSudoku(grid(
            "55..7....", "6..195...", ".98....6.",
            "8...6...3", "4..8.3..1", "7...2...6",
            ".6....28.", "...419..5", "....8..79")));
    }
}
