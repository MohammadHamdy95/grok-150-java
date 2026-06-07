package com.mohamdy.grok150.tries;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WordDictionaryTest {
    @Test void example() {
        WordDictionary d = new WordDictionary();
        d.addWord("bad");
        d.addWord("dad");
        d.addWord("mad");
        assertFalse(d.search("pad"));
        assertTrue(d.search("bad"));
        assertTrue(d.search(".ad"));
        assertTrue(d.search("b.."));
    }
    @Test void wildcardNoMatch() {
        WordDictionary d = new WordDictionary();
        d.addWord("abc");
        assertFalse(d.search("...."));
        assertFalse(d.search("ab"));
    }
    @Test void allWildcards() {
        WordDictionary d = new WordDictionary();
        d.addWord("xyz");
        assertTrue(d.search("..."));
    }
    @Test void differentLengths() {
        WordDictionary d = new WordDictionary();
        d.addWord("a");
        d.addWord("aa");
        assertTrue(d.search("a"));
        assertTrue(d.search("aa"));
        assertTrue(d.search("."));
        assertFalse(d.search("..."));
    }
}
