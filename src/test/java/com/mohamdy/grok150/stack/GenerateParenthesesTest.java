package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class GenerateParenthesesTest {
    GenerateParentheses sol = new GenerateParentheses();

    @Test void example() { assertEquals(2, sol.generateParenthesis(2).size()); }
    @Test void three() { assertEquals(5, sol.generateParenthesis(3).size()); }
}
