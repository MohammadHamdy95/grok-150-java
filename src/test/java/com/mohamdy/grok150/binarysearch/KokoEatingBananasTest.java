package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KokoEatingBananasTest {
    KokoEatingBananas sol = new KokoEatingBananas();

    @Test void example() { assertEquals(4, sol.minEatingSpeed(new int[]{3,6,7,11}, 8)); }
    @Test void example2() { assertEquals(30, sol.minEatingSpeed(new int[]{30,11,23,4,20}, 5)); }
}
