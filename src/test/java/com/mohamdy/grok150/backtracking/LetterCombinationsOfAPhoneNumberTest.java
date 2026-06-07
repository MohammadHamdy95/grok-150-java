package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LetterCombinationsOfAPhoneNumberTest {
    private final LetterCombinationsOfAPhoneNumber sol = new LetterCombinationsOfAPhoneNumber();

    @Test void example() {
        assertEquals(new HashSet<>(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                new HashSet<>(sol.letterCombinations("23")));
    }
    @Test void empty() { assertTrue(sol.letterCombinations("").isEmpty()); }
    @Test void single() { assertEquals(new HashSet<>(List.of("a", "b", "c")), new HashSet<>(sol.letterCombinations("2"))); }
    @Test void fourLetterDigit() { assertEquals(4, sol.letterCombinations("7").size()); }
}
