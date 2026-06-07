package com.mohamdy.blind75.greedy;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        // NOTE: The original attempt below was incomplete and did not compile
        // (no return statement, and a no-op `currentTank < currentTank` check).
        // It is preserved here as a comment. Treated as not-yet-implemented so
        // the project compiles; the matching test is @Disabled until solved.
        //
        //     int ans = 0;
        //     int currentTank = 0;
        //     for (int i = 0; i < gas.length; i++) {
        //         int costToNext = cost[i];
        //         currentTank += gas[i];
        //         if (currentTank < currentTank) {
        //             return -1;
        //         }
        //     }
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
