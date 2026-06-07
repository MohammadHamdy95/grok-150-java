package com.mohamdy.blind75.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MultiplyStringsTest {
    MultiplyStrings sol = new MultiplyStrings();

    @Test void example() { assertEquals("6", sol.multiply("2", "3")); }
    @Test void example2() { assertEquals("56088", sol.multiply("123", "456")); }
}
