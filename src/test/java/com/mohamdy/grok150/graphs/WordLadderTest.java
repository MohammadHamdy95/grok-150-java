package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordLadderTest {
    private final WordLadder sol = new WordLadder();

    @Test void example() { assertEquals(5, sol.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog"))); }
    @Test void noPath() { assertEquals(0, sol.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log"))); }
    @Test void oneStep() { assertEquals(2, sol.ladderLength("a", "c", List.of("a", "b", "c"))); }
    @Test void endNotInList() { assertEquals(0, sol.ladderLength("hot", "dog", List.of("hot", "dot"))); }
}
