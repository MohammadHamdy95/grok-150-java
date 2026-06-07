package com.mohamdy.grok150.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class AlienDictionaryTest {
    private final AlienDictionary sol = new AlienDictionary();

    private boolean ordered(String order, String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) != b.charAt(j)) { return order.indexOf(a.charAt(i)) < order.indexOf(b.charAt(j)); }
            i++; j++;
        }
        return a.length() <= b.length();
    }

    @Test void validOrderRespectsInput() {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        String order = sol.alienOrder(words);
        assertEquals(5, order.length());
        for (int i = 0; i + 1 < words.length; i++) { assertTrue(ordered(order, words[i], words[i + 1])); }
    }
    @Test void contradiction() { assertEquals("", sol.alienOrder(new String[]{"z", "x", "z"})); }
    @Test void prefixViolation() { assertEquals("", sol.alienOrder(new String[]{"abc", "ab"})); }
    @Test void singleWord() { assertEquals(2, sol.alienOrder(new String[]{"ab"}).length()); }
}
