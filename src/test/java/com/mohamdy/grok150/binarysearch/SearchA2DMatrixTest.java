package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SearchA2DMatrixTest {
    private final SearchA2DMatrix sol = new SearchA2DMatrix();
    private final int[][] m = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

    @Test void found() { assertTrue(sol.searchMatrix(m, 3)); }
    @Test void notFound() { assertFalse(sol.searchMatrix(m, 13)); }
    @Test void firstCell() { assertTrue(sol.searchMatrix(m, 1)); }
    @Test void lastCell() { assertTrue(sol.searchMatrix(m, 60)); }
    @Test void belowRange() { assertFalse(sol.searchMatrix(m, 0)); }
    @Test void aboveRange() { assertFalse(sol.searchMatrix(m, 61)); }
    @Test void singleCell() { assertTrue(sol.searchMatrix(new int[][]{{5}}, 5)); }
}
