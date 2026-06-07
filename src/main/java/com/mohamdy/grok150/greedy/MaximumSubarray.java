package com.mohamdy.grok150.greedy;

/**
 * LeetCode 53. Maximum Subarray &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 * //[-2,1,-3,4,-1,2,1,-5,4]
 *
 * @see <a href="https://neetcode.io/solutions/maximum-subarray">https://neetcode.io/solutions/maximum-subarray</a>
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int runningMax = nums[0];
        int overAllMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            runningMax = Math.max(num, runningMax + num);
            overAllMax = Math.max(overAllMax, runningMax);
        }

        return overAllMax;
    }
}
