package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LowestCommonAncestorOfABSTTest {
    private final LowestCommonAncestorOfABST sol = new LowestCommonAncestorOfABST();

    @Test void splitAtRoot() {
        TreeNode root = Trees.build(6, 2, 8, 0, 4, 7, 9);
        assertEquals(6, sol.lowestCommonAncestor(root, Trees.find(root, 2), Trees.find(root, 8)).val);
    }
    @Test void ancestorIsOneNode() {
        TreeNode root = Trees.build(6, 2, 8, 0, 4, 7, 9);
        assertEquals(2, sol.lowestCommonAncestor(root, Trees.find(root, 2), Trees.find(root, 4)).val);
    }
    @Test void deepNodes() {
        TreeNode root = Trees.build(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        assertEquals(2, sol.lowestCommonAncestor(root, Trees.find(root, 0), Trees.find(root, 5)).val);
    }
}
