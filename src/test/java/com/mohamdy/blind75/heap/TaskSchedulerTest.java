package com.mohamdy.blind75.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TaskSchedulerTest {
    TaskScheduler sol = new TaskScheduler();

    @Test void example() { assertEquals(8, sol.leastInterval(new char[]{'A','A','A','B','B','B'}, 2)); }
    @Test void noCooldown() { assertEquals(6, sol.leastInterval(new char[]{'A','A','A','B','B','B'}, 0)); }
}
