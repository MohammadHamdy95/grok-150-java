package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidateBinarySearchTreeTest {
    private final ValidateBinarySearchTree sol = new ValidateBinarySearchTree();

    @Test void valid() { assertTrue(sol.isValidBST(Trees.build(2, 1, 3))); }
    @Test void invalid() { assertFalse(sol.isValidBST(Trees.build(5, 1, 4, null, null, 3, 6))); }
    @Test void single() { assertTrue(sol.isValidBST(Trees.build(1))); }
    @Test void equalValuesNotAllowed() { assertFalse(sol.isValidBST(Trees.build(2, 2, 2))); }
    @Test void rightSubtreeViolation() { assertFalse(sol.isValidBST(Trees.build(5, 4, 6, null, null, 3, 7))); }
}
