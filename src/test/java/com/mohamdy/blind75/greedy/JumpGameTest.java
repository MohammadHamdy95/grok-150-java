package com.mohamdy.blind75.greedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    JumpGame sol = new JumpGame();

    @Test void reachable() { assertTrue(sol.canJump(new int[]{2, 3, 1, 1, 4})); }
    @Test void notReachable() { assertFalse(sol.canJump(new int[]{3, 2, 1, 0, 4})); }
    @Test void single() { assertTrue(sol.canJump(new int[]{0})); }
    @Test void stuck() { assertFalse(sol.canJump(new int[]{1, 0, 1, 0})); }
    @Test void bigFirstJump() { assertTrue(sol.canJump(new int[]{5, 0, 0, 0, 0, 0})); }
}
