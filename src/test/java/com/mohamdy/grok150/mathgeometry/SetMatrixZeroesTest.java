package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SetMatrixZeroesTest {
    SetMatrixZeroes sol = new SetMatrixZeroes();

    @Test void example() {
        int[][] m = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        sol.setZeroes(m);
        assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, m);
    }
}
