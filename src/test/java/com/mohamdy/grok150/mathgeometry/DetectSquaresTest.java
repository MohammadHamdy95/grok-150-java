package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
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
    @Test void noSquare() {
        DetectSquares ds = new DetectSquares();
        ds.add(new int[]{0, 0});
        assertEquals(0, ds.count(new int[]{1, 1}));
    }
    @Test void duplicatePointsMultiply() {
        DetectSquares ds = new DetectSquares();
        ds.add(new int[]{0, 0});
        ds.add(new int[]{0, 0});
        ds.add(new int[]{2, 0});
        ds.add(new int[]{0, 2});
        assertEquals(2, ds.count(new int[]{2, 2}));
    }
}
