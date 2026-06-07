package com.mohamdy.blind75.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class AlienDictionaryTest {
    AlienDictionary sol = new AlienDictionary();

    @Test void example() {
        // a valid ordering of all 5 distinct letters {w, r, t, f, e}
        assertEquals(5, sol.alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}).length());
    }

    @Test void invalidOrder() {
        // "z" before "x" then "x" before "z" -> no valid order
        assertEquals("", sol.alienOrder(new String[]{"z", "x", "z"}));
    }
}
