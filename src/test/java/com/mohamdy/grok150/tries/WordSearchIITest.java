package com.mohamdy.grok150.tries;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordSearchIITest {
    private final WordSearchII sol = new WordSearchII();

    @Test void example() {
        char[][] board = {
            {'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        assertEquals(new HashSet<>(List.of("oath", "eat")),
                new HashSet<>(sol.findWords(board, new String[]{"oath", "pea", "eat", "rain"})));
    }
    @Test void noneFound() {
        assertTrue(sol.findWords(new char[][]{{'a', 'b'}, {'c', 'd'}}, new String[]{"xyz"}).isEmpty());
    }
    @Test void singleCellWord() {
        assertEquals(List.of("a"), sol.findWords(new char[][]{{'a'}}, new String[]{"a"}));
    }
}
