package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PermutationInStringTest {
    private final PermutationInString sol = new PermutationInString();

    @Test void contains() { assertTrue(sol.checkInclusion("ab", "eidbaooo")); }
    @Test void notContains() { assertFalse(sol.checkInclusion("ab", "eidboaoo")); }
    @Test void exactMatch() { assertTrue(sol.checkInclusion("abc", "cba")); }
    @Test void longerPattern() { assertFalse(sol.checkInclusion("abcd", "abc")); }
    @Test void singleChar() { assertTrue(sol.checkInclusion("a", "a")); }
    @Test void repeated() { assertTrue(sol.checkInclusion("adc", "dcda")); }
}
