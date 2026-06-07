package com.mohamdy.grok150.greedy;

import java.util.Arrays;

/**
 * LeetCode 134. Gas Station &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://neetcode.io/problems/gas-station/question">https://neetcode.io/problems/gas-station/question</a>
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans = 0;
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];

            if (total < 0) {
                total = 0;
                ans = i + 1;
            }

        }

        return ans;
    }
}
