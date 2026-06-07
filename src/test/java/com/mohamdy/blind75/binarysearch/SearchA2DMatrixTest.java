package com.mohamdy.blind75.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SearchA2DMatrixTest {
    SearchA2DMatrix sol = new SearchA2DMatrix();

    private final int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

    @Test void found() { assertTrue(sol.searchMatrix(matrix, 3)); }
    @Test void notFound() { assertFalse(sol.searchMatrix(matrix, 13)); }
}
