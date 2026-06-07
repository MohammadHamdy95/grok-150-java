package com.mohamdy.blind75.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordLadderTest {
    WordLadder sol = new WordLadder();

    @Test void example() { assertEquals(5, sol.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log","cog"))); }
    @Test void noPath() { assertEquals(0, sol.ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log"))); }
}
