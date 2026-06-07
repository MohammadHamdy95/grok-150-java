package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BinaryTreeRightSideViewTest {
    private final BinaryTreeRightSideView sol = new BinaryTreeRightSideView();

    @Test void example() { assertEquals(List.of(1, 3, 4), sol.rightSideView(Trees.build(1, 2, 3, null, 5, null, 4))); }
    @Test void empty() { assertEquals(List.of(), sol.rightSideView(null)); }
    @Test void single() { assertEquals(List.of(1), sol.rightSideView(Trees.build(1))); }
    @Test void leftChainSeenFromRight() { assertEquals(List.of(1, 2, 3), sol.rightSideView(Trees.build(1, 2, null, 3))); }
}
