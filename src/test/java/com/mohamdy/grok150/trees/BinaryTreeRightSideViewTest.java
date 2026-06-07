package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BinaryTreeRightSideViewTest {
    BinaryTreeRightSideView sol = new BinaryTreeRightSideView();

    @Test void example() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        assertEquals(List.of(1, 3, 4), sol.rightSideView(root));
    }

    @Test void empty() { assertEquals(List.of(), sol.rightSideView(null)); }
}
