package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SameTreeTest {
    private final SameTree sol = new SameTree();

    @Test void same() { assertTrue(sol.isSameTree(Trees.build(1, 2, 3), Trees.build(1, 2, 3))); }
    @Test void differentStructure() { assertFalse(sol.isSameTree(Trees.build(1, 2), Trees.build(1, null, 2))); }
    @Test void differentValues() { assertFalse(sol.isSameTree(Trees.build(1, 2, 1), Trees.build(1, 1, 2))); }
    @Test void bothEmpty() { assertTrue(sol.isSameTree(null, null)); }
    @Test void oneEmpty() { assertFalse(sol.isSameTree(Trees.build(1), null)); }
}
