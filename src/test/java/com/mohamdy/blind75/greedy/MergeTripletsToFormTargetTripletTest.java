package com.mohamdy.blind75.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeTripletsToFormTargetTripletTest {
    MergeTripletsToFormTargetTriplet sol = new MergeTripletsToFormTargetTriplet();

    @Test void canMerge() { assertTrue(sol.mergeTriplets(new int[][]{{2,5,3},{1,8,4},{1,7,5}}, new int[]{2,7,5})); }
    @Test void cannotMerge() { assertFalse(sol.mergeTriplets(new int[][]{{3,4,5},{4,5,6}}, new int[]{3,2,5})); }
}
