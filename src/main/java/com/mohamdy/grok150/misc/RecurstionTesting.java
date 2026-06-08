package com.mohamdy.grok150.misc;

public class RecurstionTesting {

    public int sumArray(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }

        int rest = sumArray(nums, index+1);
        int current = nums[index];

        return rest + current;

    }

    static void main() {

        int[] nums = {2, 4, 6, 8};

        RecurstionTesting recurstionTesting = new RecurstionTesting();

        int ans = recurstionTesting.sumArray(nums, 0);
        System.out.println(ans);

    }
}
