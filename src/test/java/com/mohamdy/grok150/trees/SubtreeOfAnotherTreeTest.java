package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SubtreeOfAnotherTreeTest {
    private final SubtreeOfAnotherTree sol = new SubtreeOfAnotherTree();

    @Test void isSub() { assertTrue(sol.isSubtree(Trees.build(3, 4, 5, 1, 2), Trees.build(4, 1, 2))); }
    @Test void notSub() { assertFalse(sol.isSubtree(Trees.build(3, 4, 5, 1, 2, null, null, null, null, 0), Trees.build(4, 1, 2))); }
    @Test void identical() { assertTrue(sol.isSubtree(Trees.build(1, 1), Trees.build(1, 1))); }
    @Test void subIsNull() { assertTrue(sol.isSubtree(Trees.build(1), null)); }
}
