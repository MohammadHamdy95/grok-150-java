package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SetMatrixZeroesTest {
    private final SetMatrixZeroes sol = new SetMatrixZeroes();

    @Test void example() {
        int[][] m = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        sol.setZeroes(m);
        assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, m);
    }
    @Test void firstRowAndColZero() {
        int[][] m = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        sol.setZeroes(m);
        assertArrayEquals(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, m);
    }
    @Test void noZeros() {
        int[][] m = {{1, 2}, {3, 4}};
        sol.setZeroes(m);
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, m);
    }
}
