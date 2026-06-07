package com.mohamdy.grok150.greedy;

/**
 * LeetCode 55. Jump Game &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://leetcode.com/problems/jump-game/">https://leetcode.com/problems/jump-game/</a>
 */
public class JumpGame {

    public boolean canJump(int[] nums) {


        int furthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > furthest) {
                return false;
            }

            furthest = Math.max(furthest, nums[i] + i);


            if (furthest >= nums.length-1) {
                return true;
            }
        }
        return  false;
    }
}
