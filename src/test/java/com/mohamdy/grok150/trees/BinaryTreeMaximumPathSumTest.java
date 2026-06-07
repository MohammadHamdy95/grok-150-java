package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BinaryTreeMaximumPathSumTest {
    private final BinaryTreeMaximumPathSum sol = new BinaryTreeMaximumPathSum();

    @Test void example() { assertEquals(6, sol.maxPathSum(Trees.build(1, 2, 3))); }
    @Test void negativeRoot() { assertEquals(42, sol.maxPathSum(Trees.build(-10, 9, 20, null, null, 15, 7))); }
    @Test void single() { assertEquals(5, sol.maxPathSum(Trees.build(5))); }
    @Test void allNegative() { assertEquals(-1, sol.maxPathSum(Trees.build(-1, -2, -3))); }
}
