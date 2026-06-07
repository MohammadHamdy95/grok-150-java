package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RotateImageTest {
    private final RotateImage sol = new RotateImage();

    @Test void threeByThree() {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        sol.rotate(m);
        assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, m);
    }
    @Test void single() {
        int[][] m = {{1}};
        sol.rotate(m);
        assertArrayEquals(new int[][]{{1}}, m);
    }
    @Test void twoByTwo() {
        int[][] m = {{1, 2}, {3, 4}};
        sol.rotate(m);
        assertArrayEquals(new int[][]{{3, 1}, {4, 2}}, m);
    }
}
