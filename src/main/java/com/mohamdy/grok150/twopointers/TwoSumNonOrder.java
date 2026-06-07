package com.mohamdy.grok150.twopointers;

/**
 * LeetCode 167. Two Sum II - Input Array Is Sorted &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/</a>
 */
public class TwoSumNonOrder {

    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = nums.length-1;

        while (a < b) {
            int currentSum = nums[a] + nums[b];
            if (currentSum < target) {
                a ++;
            } else if (currentSum > target) {
                b--;
            } else {
                return new int[] {a,b};
            }
        }
        return null;
    }
}
