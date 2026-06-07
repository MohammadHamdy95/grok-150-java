package com.mohamdy.grok150.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TaskSchedulerTest {
    private final TaskScheduler sol = new TaskScheduler();

    @Test void example() { assertEquals(8, sol.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2)); }
    @Test void noCooldown() { assertEquals(6, sol.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0)); }
    @Test void allDistinct() { assertEquals(4, sol.leastInterval(new char[]{'A', 'B', 'C', 'D'}, 3)); }
    @Test void single() { assertEquals(1, sol.leastInterval(new char[]{'A'}, 5)); }
    @Test void heavyIdle() { assertEquals(19, sol.leastInterval(new char[]{'A', 'A', 'A', 'B', 'C', 'D', 'E'}, 8)); }
}
