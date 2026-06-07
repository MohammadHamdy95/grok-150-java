package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KokoEatingBananasTest {
    private final KokoEatingBananas sol = new KokoEatingBananas();

    @Test void example() { assertEquals(4, sol.minEatingSpeed(new int[]{3, 6, 7, 11}, 8)); }
    @Test void tightDeadline() { assertEquals(30, sol.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5)); }
    @Test void looseDeadline() { assertEquals(23, sol.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6)); }
    @Test void single() { assertEquals(4, sol.minEatingSpeed(new int[]{4}, 1)); }
    @Test void plentyOfTime() { assertEquals(1, sol.minEatingSpeed(new int[]{1, 1, 1, 1}, 100)); }
}
