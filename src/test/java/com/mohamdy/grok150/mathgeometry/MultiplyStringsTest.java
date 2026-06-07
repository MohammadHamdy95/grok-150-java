package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MultiplyStringsTest {
    private final MultiplyStrings sol = new MultiplyStrings();

    @Test void example() { assertEquals("6", sol.multiply("2", "3")); }
    @Test void example2() { assertEquals("56088", sol.multiply("123", "456")); }
    @Test void zero() { assertEquals("0", sol.multiply("0", "12345")); }
    @Test void large() { assertEquals("121932631112635269", sol.multiply("123456789", "987654321")); }
    @Test void carries() { assertEquals("9801", sol.multiply("99", "99")); }
}
