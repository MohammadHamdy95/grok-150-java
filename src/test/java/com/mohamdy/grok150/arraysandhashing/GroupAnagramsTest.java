package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class GroupAnagramsTest {
    private final GroupAnagrams sol = new GroupAnagrams();

    @Test void example() {
        assertEquals(
            canonS(List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"))),
            canonS(sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})));
    }
    @Test void emptyStringGroup() {
        assertEquals(canonS(List.of(List.of(""))), canonS(sol.groupAnagrams(new String[]{""})));
    }
    @Test void single() {
        assertEquals(canonS(List.of(List.of("a"))), canonS(sol.groupAnagrams(new String[]{"a"})));
    }
    @Test void allUnique() {
        assertEquals(
            canonS(List.of(List.of("abc"), List.of("def"), List.of("ghi"))),
            canonS(sol.groupAnagrams(new String[]{"abc", "def", "ghi"})));
    }
    @Test void allSameGroup() {
        assertEquals(
            canonS(List.of(List.of("aab", "aba", "baa"))),
            canonS(sol.groupAnagrams(new String[]{"aab", "aba", "baa"})));
    }
}
