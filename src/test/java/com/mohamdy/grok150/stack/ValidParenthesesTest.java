package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidParenthesesTest {
    private final ValidParentheses sol = new ValidParentheses();

    @Test void simple() { assertTrue(sol.isValid("()[]{}")); }
    @Test void mismatched() { assertFalse(sol.isValid("(]")); }
    @Test void nested() { assertTrue(sol.isValid("{[]}")); }
    @Test void unclosed() { assertFalse(sol.isValid("(")); }
    @Test void unopened() { assertFalse(sol.isValid(")")); }
    @Test void empty() { assertTrue(sol.isValid("")); }
    @Test void wrongOrder() { assertFalse(sol.isValid("([)]")); }
    @Test void deeplyNested() { assertTrue(sol.isValid("((((()))))")); }
}
