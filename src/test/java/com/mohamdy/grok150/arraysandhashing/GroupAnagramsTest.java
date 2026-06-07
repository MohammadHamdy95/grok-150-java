package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class GroupAnagramsTest {
    GroupAnagrams sol = new GroupAnagrams();

    @Test void example() {
        // expected 3 groups: [bat], [nat, tan], [ate, eat, tea]
        assertEquals(3, sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size());
    }

    @Test void single() {
        assertEquals(1, sol.groupAnagrams(new String[]{"a"}).size());
    }
}
