package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MeetingRoomsIITest {
    private final MeetingRoomsII sol = new MeetingRoomsII();

    @Test void example() { assertEquals(2, sol.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}})); }
    @Test void one() { assertEquals(1, sol.minMeetingRooms(new int[][]{{7, 10}, {2, 4}})); }
    @Test void empty() { assertEquals(0, sol.minMeetingRooms(new int[][]{})); }
    @Test void allOverlap() { assertEquals(3, sol.minMeetingRooms(new int[][]{{1, 10}, {2, 7}, {3, 19}})); }
    @Test void backToBack() { assertEquals(1, sol.minMeetingRooms(new int[][]{{1, 5}, {5, 10}, {10, 15}})); }
}
