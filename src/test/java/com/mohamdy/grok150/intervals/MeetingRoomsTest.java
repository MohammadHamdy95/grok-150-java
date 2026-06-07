package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MeetingRoomsTest {
    MeetingRooms sol = new MeetingRooms();

    @Test void cannot() { assertFalse(sol.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}})); }
    @Test void can() { assertTrue(sol.canAttendMeetings(new int[][]{{7, 10}, {2, 4}})); }
}
