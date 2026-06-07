package com.mohamdy.grok150.support;

import com.mohamdy.grok150.trees.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Test-only helpers for building binary trees from LeetCode-style level-order
 * arrays (using {@code null} for absent children) and locating nodes by value.
 */
public final class Trees {
    private Trees() {
    }

    public static TreeNode build(Integer... level) {
        if (level.length == 0 || level[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode(level[0]);
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int i = 1;
        while (i < level.length && !q.isEmpty()) {
            TreeNode cur = q.poll();
            if (i < level.length) {
                if (level[i] != null) {
                    cur.left = new TreeNode(level[i]);
                    q.add(cur.left);
                }
                i++;
            }
            if (i < level.length) {
                if (level[i] != null) {
                    cur.right = new TreeNode(level[i]);
                    q.add(cur.right);
                }
                i++;
            }
        }
        return root;
    }

    /** Depth-first search for the first node whose value equals {@code val}. */
    public static TreeNode find(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode l = find(root.left, val);
        return l != null ? l : find(root.right, val);
    }
}
