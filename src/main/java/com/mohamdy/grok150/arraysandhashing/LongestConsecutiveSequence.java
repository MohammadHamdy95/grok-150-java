package com.mohamdy.grok150.arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 128. Longest Consecutive Sequence &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(n).
 *
 * @see <a href="https://neetcode.io/problems/longest-consecutive-sequence/question">https://neetcode.io/problems/longest-consecutive-sequence/question</a>
 */
public class LongestConsecutiveSequence {


    //This one seems to be failing with really long arrays.
    public int longestConsecutive1(int[] nums) {
        int allTimeMax = 0;
        HashMap<Integer, Integer> intFreqMap = new HashMap<>();

        for (Integer num : nums) {
            //This stores the current max subarray for the current nums[n]
            int currentMax = 1;

            //When iterating through the nums, we first want to add the entry into the hashmap.
            int currentCount = intFreqMap.getOrDefault(num, 0);
            currentCount++;
            intFreqMap.put(num, currentCount);

            //Once the entry is added, then we want to check if we have any contiguous stuff, before or after.
            int j = num+1;
            int k = num-1;

            //First we will check after.
            while (intFreqMap.containsKey(j)) {
                currentMax ++;
                j++;
            }

            if (currentMax > allTimeMax) {
                allTimeMax = currentMax;
            }

            //Now we are checking before.
            while (intFreqMap.containsKey(k)) {
                currentMax ++;
                k--;
            }

            if (currentMax > allTimeMax) {
                allTimeMax = currentMax;
            }
        }
        return allTimeMax;
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int allTimeMax = 1;
        Set<Integer> integerSet = new HashSet<>();

        for (Integer num : nums) {
            integerSet.add(num);
        }

        for (Integer x : integerSet) {
            if (!integerSet.contains(x+1)) {
                int y = x - 1;
                while (integerSet.contains(y)) {
                    y -= 1;
                    allTimeMax = Integer.max(x-y, allTimeMax);
                }
            }
        }
        return allTimeMax;
    }
}
