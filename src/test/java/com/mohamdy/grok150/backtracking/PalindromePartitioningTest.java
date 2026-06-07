package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PalindromePartitioningTest {
    private final PalindromePartitioning sol = new PalindromePartitioning();

    @Test void example() {
        assertEquals(canonS(List.of(List.of("a", "a", "b"), List.of("aa", "b"))),
                canonS(sol.partition("aab")));
    }
    @Test void single() { assertEquals(canonS(List.of(List.of("a"))), canonS(sol.partition("a"))); }
    @Test void allDistinct() { assertEquals(canonS(List.of(List.of("a", "b", "c"))), canonS(sol.partition("abc"))); }
    @Test void fullPalindrome() {
        assertEquals(canonS(List.of(List.of("a", "a", "a"), List.of("a", "aa"), List.of("aa", "a"), List.of("aaa"))),
                canonS(sol.partition("aaa")));
    }
}
