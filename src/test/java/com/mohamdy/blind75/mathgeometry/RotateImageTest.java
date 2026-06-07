package com.mohamdy.blind75.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RotateImageTest {
    RotateImage sol = new RotateImage();

    @Test void example() {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        sol.rotate(m);
        assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, m);
    }
}
