package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SurroundedRegionsTest {
    private final SurroundedRegions sol = new SurroundedRegions();

    @Test void example() {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        sol.solve(board);
        assertArrayEquals(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}}, board);
    }
    @Test void borderOStays() {
        char[][] board = {{'O', 'O'}, {'O', 'O'}};
        sol.solve(board);
        assertArrayEquals(new char[][]{{'O', 'O'}, {'O', 'O'}}, board);
    }
    @Test void singleInteriorCaptured() {
        char[][] board = {{'X', 'X', 'X'}, {'X', 'O', 'X'}, {'X', 'X', 'X'}};
        sol.solve(board);
        assertArrayEquals(new char[][]{{'X', 'X', 'X'}, {'X', 'X', 'X'}, {'X', 'X', 'X'}}, board);
    }
}
