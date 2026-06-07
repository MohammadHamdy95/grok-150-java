package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MeetingRoomsTest {
    private final MeetingRooms sol = new MeetingRooms();

    @Test void cannot() { assertFalse(sol.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}})); }
    @Test void can() { assertTrue(sol.canAttendMeetings(new int[][]{{7, 10}, {2, 4}})); }
    @Test void empty() { assertTrue(sol.canAttendMeetings(new int[][]{})); }
    @Test void touchingOk() { assertTrue(sol.canAttendMeetings(new int[][]{{1, 5}, {5, 10}})); }
    @Test void single() { assertTrue(sol.canAttendMeetings(new int[][]{{1, 2}})); }
}
