package com.mohamdy.grok150.greedy;

/**
 * LeetCode 45. Jump Game II &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://leetcode.com/problems/jump-game-ii/">https://leetcode.com/problems/jump-game-ii/</a>
 */
public class MinJumpsII {

    public int jump(int[] nums) {
        int r = 0;
        int l = 0;
        int ans = 0;

        while (r < nums.length-1) {
            int furthest = 0;
            for (int i = l;i <=r; i++) {
                furthest = Math.max(nums[i] + i, furthest);
            }
            l = r+1;
            r = furthest;
            ans++;
            System.out.println(l);
        }
        return ans;
    }

    static void main() {

        MinJumpsII minJumpsII = new MinJumpsII();
        int[] ints = new int[] {
                5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0
        };

        int ans = minJumpsII.jump(ints);
    }
}
