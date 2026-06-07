package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SpiralMatrixTest {
    SpiralMatrix sol = new SpiralMatrix();

    @Test void example() {
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                sol.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
