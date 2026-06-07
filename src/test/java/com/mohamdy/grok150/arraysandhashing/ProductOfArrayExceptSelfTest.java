package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf sol = new ProductOfArrayExceptSelf();

    @Test void example() { assertArrayEquals(new int[]{24, 12, 8, 6}, sol.productExceptSelf(new int[]{1, 2, 3, 4})); }
    @Test void withZero() { assertArrayEquals(new int[]{0, 0, 9, 0, 0}, sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3})); }
    @Test void twoElements() { assertArrayEquals(new int[]{3, 2}, sol.productExceptSelf(new int[]{2, 3})); }
    @Test void twoZeros() { assertArrayEquals(new int[]{0, 0}, sol.productExceptSelf(new int[]{0, 0})); }
    @Test void ones() { assertArrayEquals(new int[]{1, 1, 1}, sol.productExceptSelf(new int[]{1, 1, 1})); }
    @Test void negatives() { assertArrayEquals(new int[]{8, 20, 40, 10}, sol.productExceptSelf(new int[]{5, 2, 1, 4})); }
}
