package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DetectSquaresTest {
    @Test void example() {
        DetectSquares ds = new DetectSquares();
        ds.add(new int[]{3, 10});
        ds.add(new int[]{11, 2});
        ds.add(new int[]{3, 2});
        assertEquals(1, ds.count(new int[]{11, 10}));
        assertEquals(0, ds.count(new int[]{14, 8}));
        ds.add(new int[]{11, 2});
        assertEquals(2, ds.count(new int[]{11, 10}));
    }
}
