package com.mohamdy.blind75.twopointers;

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
