package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PartitionLabelsTest {
    private final PartitionLabels sol = new PartitionLabels();

    @Test void example() { assertEquals(List.of(9, 7, 8), sol.partitionLabels("ababcbacadefegdehijhklij")); }
    @Test void single() { assertEquals(List.of(1), sol.partitionLabels("a")); }
    @Test void allSame() { assertEquals(List.of(5), sol.partitionLabels("aaaaa")); }
    @Test void allDistinct() { assertEquals(List.of(1, 1, 1), sol.partitionLabels("abc")); }
}
