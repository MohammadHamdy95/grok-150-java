package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ThreeSumTest {
    private final ThreeSum sol = new ThreeSum();

    @Test void example() {
        assertEquals(canon(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                canon(sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
    }
    @Test void allZeros() { assertEquals(canon(List.of(List.of(0, 0, 0))), canon(sol.threeSum(new int[]{0, 0, 0}))); }
    @Test void noTriplet() { assertTrue(sol.threeSum(new int[]{0, 1, 1}).isEmpty()); }
    @Test void tooFew() { assertTrue(sol.threeSum(new int[]{1, -1}).isEmpty()); }
    @Test void multipleTriplets() {
        assertEquals(canon(List.of(List.of(-2, -1, 3), List.of(-2, 0, 2), List.of(-1, 0, 1))),
                canon(sol.threeSum(new int[]{3, 0, -2, -1, 1, 2})));
    }
}
