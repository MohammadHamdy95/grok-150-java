package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordBreakTest {
    private final WordBreak sol = new WordBreak();

    @Test void breakable() { assertTrue(sol.wordBreak("leetcode", List.of("leet", "code"))); }
    @Test void reusableWords() { assertTrue(sol.wordBreak("applepenapple", List.of("apple", "pen"))); }
    @Test void notBreakable() { assertFalse(sol.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"))); }
    @Test void singleChar() { assertTrue(sol.wordBreak("a", List.of("a"))); }
    @Test void noMatch() { assertFalse(sol.wordBreak("ab", List.of("c"))); }
}
