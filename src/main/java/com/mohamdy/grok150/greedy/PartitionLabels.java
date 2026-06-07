package com.mohamdy.grok150.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * LeetCode 763. Partition Labels &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1) (fixed alphabet).
 *
 * @see <a href="https://leetcode.com/problems/partition-labels/">https://leetcode.com/problems/partition-labels/</a>
 * ababcbaca//defegdehijhklij
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            characterIntegerHashMap.put(s.charAt(i), i);
        }



        //Here we will create a variable that is soonest possible break point, we are only able to break here.
        int soonestBreak = 0;

        //This is the size of the current string.
        int stringLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int potentialBreak = characterIntegerHashMap.get(s.charAt(i));
            soonestBreak = Math.max(potentialBreak, soonestBreak);
            stringLength++;
            if (i == soonestBreak) {
                integers.add(stringLength);
                stringLength = 0;
            }
        }
        return integers;
    }
}
