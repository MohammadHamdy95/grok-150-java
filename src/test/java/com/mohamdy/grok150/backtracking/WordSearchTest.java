package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordSearchTest {
    private final WordSearch sol = new WordSearch();
    private final char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

    @Test void found() { assertTrue(sol.exist(board, "ABCCED")); }
    @Test void foundShort() { assertTrue(sol.exist(board, "SEE")); }
    @Test void notFound() { assertFalse(sol.exist(board, "ABCB")); }
    @Test void singleCellTrue() { assertTrue(sol.exist(new char[][]{{'a'}}, "a")); }
    @Test void singleCellFalse() { assertFalse(sol.exist(new char[][]{{'a'}}, "b")); }
}
