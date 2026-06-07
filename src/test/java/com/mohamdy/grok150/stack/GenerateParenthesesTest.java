package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class GenerateParenthesesTest {
    private final GenerateParentheses sol = new GenerateParentheses();

    @Test void one() { assertEquals(List.of("()"), sol.generateParenthesis(1)); }
    @Test void twoCount() { assertEquals(2, sol.generateParenthesis(2).size()); }
    @Test void threeCount() { assertEquals(5, sol.generateParenthesis(3).size()); }
    @Test void fourCount() { assertEquals(14, sol.generateParenthesis(4).size()); }
    @Test void allValidAndBalanced() {
        for (String s : sol.generateParenthesis(3)) {
            int bal = 0;
            for (char c : s.toCharArray()) { bal += c == '(' ? 1 : -1; assertTrue(bal >= 0); }
            assertEquals(0, bal);
            assertEquals(6, s.length());
        }
    }
    @Test void noDuplicates() {
        List<String> r = sol.generateParenthesis(3);
        assertEquals(r.size(), new HashSet<>(r).size());
    }
}
