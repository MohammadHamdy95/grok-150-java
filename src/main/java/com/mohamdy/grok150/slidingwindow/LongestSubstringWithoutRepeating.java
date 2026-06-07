package com.mohamdy.grok150.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 3. Longest Substring Without Repeating Characters &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(min(n, alphabet)).
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">https://leetcode.com/problems/longest-substring-without-repeating-characters/</a>
 */
public class LongestSubstringWithoutRepeating {


    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int allTimeMax = 0;

        for (int i = 0; i < s.length(); i++ ) {
            int currentMax = 1;
            int y = i;
            Set<Character> characters = new HashSet<>();
            while (y < s.length() && !characters.contains(s.charAt(y))) {
                characters.add(s.charAt(y));
                y++;
                currentMax++;
                allTimeMax = Math.max(currentMax, allTimeMax);
            }
        }
        return allTimeMax;
    }

}
