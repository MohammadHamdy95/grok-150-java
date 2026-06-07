package com.mohamdy.grok150.greedy;

/**
 * LeetCode 53. Maximum Subarray &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">https://leetcode.com/problems/maximum-subarray/</a>
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int runningMax = -1001;
        int overAllMax = -1001;
        for (int i = 0; i < nums.length; i++) {
            runningMax = Math.max(nums[i], runningMax + nums[i]);
            overAllMax = Math.max(overAllMax, runningMax);
        }

        return overAllMax;

    }
}
