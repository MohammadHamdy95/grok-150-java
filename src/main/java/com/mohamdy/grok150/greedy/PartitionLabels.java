package com.mohamdy.grok150.greedy;

import java.util.HashMap;
import java.util.List;

/**
 * LeetCode 763. Partition Labels &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1) (fixed alphabet).
 *
 * @see <a href="https://leetcode.com/problems/partition-labels/">https://leetcode.com/problems/partition-labels/</a>
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            characterIntegerHashMap.put(s.charAt(i), i);
        }



    }
}
