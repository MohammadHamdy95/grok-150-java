package com.mohamdy.blind75.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordSearchTest {
    WordSearch sol = new WordSearch();

    private final char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'S', 'F', 'C', 'S'},
        {'A', 'D', 'E', 'E'}
    };

    @Test void found() { assertTrue(sol.exist(board, "ABCCED")); }
    @Test void notFound() { assertFalse(sol.exist(board, "ABCB")); }
}
