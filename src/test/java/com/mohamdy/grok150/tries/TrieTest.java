package com.mohamdy.grok150.tries;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TrieTest {
    @Test void example() {
        Trie t = new Trie();
        t.insert("apple");
        assertTrue(t.search("apple"));
        assertFalse(t.search("app"));
        assertTrue(t.startsWith("app"));
        t.insert("app");
        assertTrue(t.search("app"));
    }
    @Test void prefixVsWord() {
        Trie t = new Trie();
        t.insert("application");
        assertTrue(t.startsWith("app"));
        assertFalse(t.search("app"));
        assertFalse(t.startsWith("apz"));
    }
    @Test void absentBeforeInsert() {
        Trie t = new Trie();
        assertFalse(t.search("a"));
        assertFalse(t.startsWith("a"));
    }
    @Test void overlappingWords() {
        Trie t = new Trie();
        t.insert("car");
        t.insert("card");
        t.insert("care");
        assertTrue(t.search("car"));
        assertTrue(t.search("card"));
        assertTrue(t.search("care"));
        assertFalse(t.search("ca"));
        assertTrue(t.startsWith("car"));
    }
}
