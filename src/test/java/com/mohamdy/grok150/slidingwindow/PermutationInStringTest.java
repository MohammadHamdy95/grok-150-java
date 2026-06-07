package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PermutationInStringTest {
    PermutationInString sol = new PermutationInString();

    @Test void contains() { assertTrue(sol.checkInclusion("ab", "eidbaooo")); }
    @Test void notContains() { assertFalse(sol.checkInclusion("ab", "eidboaoo")); }
}
