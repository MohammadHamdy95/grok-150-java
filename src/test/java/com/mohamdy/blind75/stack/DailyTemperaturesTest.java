package com.mohamdy.blind75.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DailyTemperaturesTest {
    DailyTemperatures sol = new DailyTemperatures();

    @Test void example() { assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, sol.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})); }
}
