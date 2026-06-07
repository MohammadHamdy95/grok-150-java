package com.mohamdy.blind75.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KClosestPointsToOriginTest {
    KClosestPointsToOrigin sol = new KClosestPointsToOrigin();

    @Test void example() {
        // expected (order-independent): one point, [[-2,2]]
        assertEquals(1, sol.kClosest(new int[][]{{1,3},{-2,2}}, 1).length);
    }
}
