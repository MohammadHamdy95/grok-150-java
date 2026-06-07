package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class HandOfStraightsTest {
    HandOfStraights sol = new HandOfStraights();

    @Test void canForm() { assertTrue(sol.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3)); }
    @Test void cannotForm() { assertFalse(sol.isNStraightHand(new int[]{1,2,3,4,5}, 4)); }
}
