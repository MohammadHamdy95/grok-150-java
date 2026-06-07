package com.mohamdy.blind75.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PartitionLabelsTest {
    PartitionLabels sol = new PartitionLabels();

    @Test void example() { assertEquals(List.of(9, 7, 8), sol.partitionLabels("ababcbacadefegdehijhklij")); }
}
