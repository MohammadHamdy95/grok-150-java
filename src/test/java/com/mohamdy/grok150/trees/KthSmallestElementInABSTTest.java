package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KthSmallestElementInABSTTest {
    private final KthSmallestElementInABST sol = new KthSmallestElementInABST();

    @Test void first() { assertEquals(1, sol.kthSmallest(Trees.build(3, 1, 4, null, 2), 1)); }
    @Test void last() { assertEquals(4, sol.kthSmallest(Trees.build(3, 1, 4, null, 2), 4)); }
    @Test void middle() { assertEquals(3, sol.kthSmallest(Trees.build(5, 3, 6, 2, 4, null, null, 1), 3)); }
    @Test void single() { assertEquals(7, sol.kthSmallest(Trees.build(7), 1)); }
}
