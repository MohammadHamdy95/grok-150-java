package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CourseScheduleIITest {
    CourseScheduleII sol = new CourseScheduleII();

    @Test void example() { assertArrayEquals(new int[]{0,1}, sol.findOrder(2, new int[][]{{1,0}})); }
    @Test void cycle() { assertArrayEquals(new int[]{}, sol.findOrder(2, new int[][]{{1,0},{0,1}})); }
}
