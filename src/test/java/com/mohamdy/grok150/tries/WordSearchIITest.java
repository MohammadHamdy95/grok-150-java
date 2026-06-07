package com.mohamdy.grok150.tries;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordSearchIITest {
    WordSearchII sol = new WordSearchII();

    @Test void example() {
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        // expected (order-independent): [oath, eat]
        assertEquals(2, sol.findWords(board, words).size());
    }
}
