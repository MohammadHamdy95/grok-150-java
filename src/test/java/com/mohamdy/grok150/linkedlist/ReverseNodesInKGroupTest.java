package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseNodesInKGroupTest {
    ReverseNodesInKGroup sol = new ReverseNodesInKGroup();

    @Test void k2() { assertArrayEquals(new int[]{2,1,4,3,5}, ListNodes.toArray(sol.reverseKGroup(ListNodes.of(1,2,3,4,5), 2))); }
    @Test void k3() { assertArrayEquals(new int[]{3,2,1,4,5}, ListNodes.toArray(sol.reverseKGroup(ListNodes.of(1,2,3,4,5), 3))); }
}
