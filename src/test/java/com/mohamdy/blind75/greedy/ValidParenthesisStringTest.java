package com.mohamdy.blind75.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidParenthesisStringTest {
    ValidParenthesisString sol = new ValidParenthesisString();

    @Test void valid() { assertTrue(sol.checkValidString("(*))")); }
    @Test void alsoValid() { assertTrue(sol.checkValidString("(*)")); }
    @Test void invalid() { assertFalse(sol.checkValidString(")(")); }
}
