package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class HandOfStraightsTest {
    private final HandOfStraights sol = new HandOfStraights();

    @Test void canForm() { assertTrue(sol.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3)); }
    @Test void cannotForm() { assertFalse(sol.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4)); }
    @Test void groupSizeOne() { assertTrue(sol.isNStraightHand(new int[]{1, 2, 3}, 1)); }
    @Test void wholeHand() { assertTrue(sol.isNStraightHand(new int[]{1, 2, 3, 4}, 4)); }
    @Test void notDivisible() { assertFalse(sol.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 2)); }
}
