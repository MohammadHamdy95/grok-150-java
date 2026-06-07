package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidParenthesisStringTest {
    private final ValidParenthesisString sol = new ValidParenthesisString();

    @Test void plain() { assertTrue(sol.checkValidString("()")); }
    @Test void starAsClose() { assertTrue(sol.checkValidString("(*)")); }
    @Test void starAsEmpty() { assertTrue(sol.checkValidString("(*))")); }
    @Test void invalid() { assertFalse(sol.checkValidString(")(")); }
    @Test void onlyStars() { assertTrue(sol.checkValidString("****")); }
    @Test void unbalanced() { assertFalse(sol.checkValidString("((*)")); }
    @Test void empty() { assertTrue(sol.checkValidString("")); }
}
