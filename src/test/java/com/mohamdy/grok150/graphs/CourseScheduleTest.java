package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CourseScheduleTest {
    private final CourseSchedule sol = new CourseSchedule();

    @Test void canFinish() { assertTrue(sol.canFinish(2, new int[][]{{1, 0}})); }
    @Test void cycle() { assertFalse(sol.canFinish(2, new int[][]{{1, 0}, {0, 1}})); }
    @Test void noPrereqs() { assertTrue(sol.canFinish(3, new int[][]{})); }
    @Test void chain() { assertTrue(sol.canFinish(4, new int[][]{{1, 0}, {2, 1}, {3, 2}})); }
    @Test void selfCycle() { assertFalse(sol.canFinish(1, new int[][]{{0, 0}})); }
}
