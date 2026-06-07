package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ProductOfArrayExceptSelfTest {
    ProductOfArrayExceptSelf sol = new ProductOfArrayExceptSelf();

    @Test void example() { assertArrayEquals(new int[]{24, 12, 8, 6}, sol.productExceptSelf(new int[]{1, 2, 3, 4})); }
    @Test void withZero() { assertArrayEquals(new int[]{0, 0, 9, 0, 0}, sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3})); }
}
