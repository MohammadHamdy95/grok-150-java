package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeTripletsToFormTargetTripletTest {
    private final MergeTripletsToFormTargetTriplet sol = new MergeTripletsToFormTargetTriplet();

    @Test void canMerge() { assertTrue(sol.mergeTriplets(new int[][]{{2, 5, 3}, {1, 8, 4}, {1, 7, 5}}, new int[]{2, 7, 5})); }
    @Test void cannotMerge() { assertFalse(sol.mergeTriplets(new int[][]{{3, 4, 5}, {4, 5, 6}}, new int[]{3, 2, 5})); }
    @Test void exactSingle() { assertTrue(sol.mergeTriplets(new int[][]{{1, 2, 3}}, new int[]{1, 2, 3})); }
    @Test void overshootBlocks() { assertFalse(sol.mergeTriplets(new int[][]{{1, 3, 4}, {2, 5, 8}}, new int[]{2, 5, 3})); }
}
