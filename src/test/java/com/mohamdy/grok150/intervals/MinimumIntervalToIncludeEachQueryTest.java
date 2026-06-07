package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinimumIntervalToIncludeEachQueryTest {
    MinimumIntervalToIncludeEachQuery sol = new MinimumIntervalToIncludeEachQuery();

    @Test void example() {
        assertArrayEquals(new int[]{3,3,1,4}, sol.minInterval(new int[][]{{1,4},{2,4},{3,6},{4,4}}, new int[]{2,3,4,5}));
    }
}
