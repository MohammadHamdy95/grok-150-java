package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SpiralMatrixTest {
    private final SpiralMatrix sol = new SpiralMatrix();

    @Test void square() { assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), sol.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); }
    @Test void rectangle() { assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), sol.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})); }
    @Test void singleRow() { assertEquals(List.of(1, 2, 3), sol.spiralOrder(new int[][]{{1, 2, 3}})); }
    @Test void singleColumn() { assertEquals(List.of(1, 2, 3), sol.spiralOrder(new int[][]{{1}, {2}, {3}})); }
    @Test void single() { assertEquals(List.of(7), sol.spiralOrder(new int[][]{{7}})); }
}
