package com.mohamdy.blind75.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PlusOneTest {
    PlusOne sol = new PlusOne();

    @Test void example() { assertArrayEquals(new int[]{1,2,4}, sol.plusOne(new int[]{1,2,3})); }
    @Test void carry() { assertArrayEquals(new int[]{1,0,0}, sol.plusOne(new int[]{9,9})); }
}
