package com.mohamdy.blind75.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidParenthesesTest {
    ValidParentheses sol = new ValidParentheses();

    @Test void simple() { assertTrue(sol.isValid("()[]{}")); }
    @Test void mismatched() { assertFalse(sol.isValid("(]")); }
    @Test void nested() { assertTrue(sol.isValid("{[]}")); }
    @Test void unclosed() { assertFalse(sol.isValid("(")); }
}
