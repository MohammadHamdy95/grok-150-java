package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MeetingRoomsIITest {
    MeetingRoomsII sol = new MeetingRoomsII();

    @Test void example() { assertEquals(2, sol.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}})); }
    @Test void one() { assertEquals(1, sol.minMeetingRooms(new int[][]{{7, 10}, {2, 4}})); }
}
