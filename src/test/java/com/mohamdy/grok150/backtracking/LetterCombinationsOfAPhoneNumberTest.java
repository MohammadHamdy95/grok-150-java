package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LetterCombinationsOfAPhoneNumberTest {
    LetterCombinationsOfAPhoneNumber sol = new LetterCombinationsOfAPhoneNumber();

    @Test void example() { assertEquals(9, sol.letterCombinations("23").size()); }
    @Test void empty() { assertEquals(0, sol.letterCombinations("").size()); }
}
