package com.mohamdy.grok150.arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 1. Two Sum &mdash; Easy
 *
 * <p>Complexity (optimal): Time O(n), Space O(n).
 *
 * @see <a href="https://neetcode.io/solutions/two-sum">https://neetcode.io/solutions/two-sum</a>
 */
public class TwoSum {
    static void main() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[] {2,7,11,15};

        twoSum.twoSum(nums, 9);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> integerSet = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            integerSet.put(nums[i], i);
        }

        for (int i = 0;i < nums.length; i++) {
            int compliment = target - nums[i];

            if (integerSet.containsKey(compliment) && i != integerSet.get(compliment)) {
                return new int[] {i, integerSet.get(compliment)};
            }
        }
        return null;
    }

}
