package com.mohamdy.blind75.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordBreakTest {
    WordBreak sol = new WordBreak();

    @Test void breakable() { assertTrue(sol.wordBreak("leetcode", List.of("leet", "code"))); }
    @Test void notBreakable() { assertFalse(sol.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"))); }
}
