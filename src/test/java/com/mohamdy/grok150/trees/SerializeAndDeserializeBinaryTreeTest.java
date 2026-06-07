package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SerializeAndDeserializeBinaryTreeTest {
    SerializeAndDeserializeBinaryTree sol = new SerializeAndDeserializeBinaryTree();

    @Test void roundTrip() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        TreeNode r = sol.deserialize(sol.serialize(root));
        assertEquals(1, r.val);
        assertEquals(2, r.left.val);
        assertEquals(3, r.right.val);
        assertEquals(4, r.right.left.val);
        assertEquals(5, r.right.right.val);
    }

    @Test void empty() { assertNull(sol.deserialize(sol.serialize(null))); }
}
