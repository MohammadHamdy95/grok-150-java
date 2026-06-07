package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SerializeAndDeserializeBinaryTreeTest {
    private final SerializeAndDeserializeBinaryTree sol = new SerializeAndDeserializeBinaryTree();

    @Test void roundTrip() {
        TreeNode root = Trees.build(1, 2, 3, null, null, 4, 5);
        TreeNode r = sol.deserialize(sol.serialize(root));
        assertEquals(1, r.val);
        assertEquals(2, r.left.val);
        assertEquals(3, r.right.val);
        assertEquals(4, r.right.left.val);
        assertEquals(5, r.right.right.val);
    }
    @Test void empty() { assertNull(sol.deserialize(sol.serialize(null))); }
    @Test void single() { assertEquals(7, sol.deserialize(sol.serialize(Trees.build(7))).val); }
    @Test void negativesAndSkew() {
        TreeNode r = sol.deserialize(sol.serialize(Trees.build(-5, -10, null, -20)));
        assertEquals(-5, r.val);
        assertEquals(-10, r.left.val);
        assertEquals(-20, r.left.left.val);
    }
}
