package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PartitionEqualSubsetSumTest {
    PartitionEqualSubsetSum sol = new PartitionEqualSubsetSum();

    @Test void canPartition() { assertTrue(sol.canPartition(new int[]{1,5,11,5})); }
    @Test void cannotPartition() { assertFalse(sol.canPartition(new int[]{1,2,3,5})); }
}
