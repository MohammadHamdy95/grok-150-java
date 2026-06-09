package com.mohamdy.grok150.greedy;

/**
 * LeetCode 134. Gas Station &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n), Space O(1).
 *
 * @see <a href="https://neetcode.io/problems/gas-station/question">https://neetcode.io/problems/gas-station/question</a>
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGasInSystem = 0;
        int totalCostInSystem = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGasInSystem += gas[i];
            totalCostInSystem += cost[i];
        }

        if (totalCostInSystem > totalGasInSystem) {
            return -1;
        }

        int currentTank = 0;
        int ans = 0;
        for (int i = 0; i < gas.length; i++) {
            currentTank += gas[i] - cost[i];

            if (currentTank < 0) {
                currentTank = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
}
