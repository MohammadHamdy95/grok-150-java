package com.mohamdy.grok150.tries;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordDictionaryTest {
    @Test void example() {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        assertFalse(dictionary.search("pad"));
        assertTrue(dictionary.search("bad"));
        assertTrue(dictionary.search(".ad"));
        assertTrue(dictionary.search("b.."));
    }
}
