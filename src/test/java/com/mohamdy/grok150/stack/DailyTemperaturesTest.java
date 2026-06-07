package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DailyTemperaturesTest {
    private final DailyTemperatures sol = new DailyTemperatures();

    @Test void example() { assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, sol.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})); }
    @Test void increasing() { assertArrayEquals(new int[]{1, 1, 1, 0}, sol.dailyTemperatures(new int[]{30, 40, 50, 60})); }
    @Test void decreasing() { assertArrayEquals(new int[]{0, 0, 0}, sol.dailyTemperatures(new int[]{60, 50, 40})); }
    @Test void single() { assertArrayEquals(new int[]{0}, sol.dailyTemperatures(new int[]{50})); }
    @Test void plateau() { assertArrayEquals(new int[]{0, 0, 0}, sol.dailyTemperatures(new int[]{40, 40, 40})); }
}
