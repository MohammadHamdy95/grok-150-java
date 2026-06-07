package com.mohamdy.blind75.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CourseScheduleTest {
    CourseSchedule sol = new CourseSchedule();

    @Test void canFinish() { assertTrue(sol.canFinish(2, new int[][]{{1, 0}})); }
    @Test void cycle() { assertFalse(sol.canFinish(2, new int[][]{{1, 0}, {0, 1}})); }
}
