package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class HappyNumberTest {
    private final HappyNumber sol = new HappyNumber();

    @Test void happy() { assertTrue(sol.isHappy(19)); }
    @Test void notHappy() { assertFalse(sol.isHappy(2)); }
    @Test void one() { assertTrue(sol.isHappy(1)); }
    @Test void seven() { assertTrue(sol.isHappy(7)); }
    @Test void four() { assertFalse(sol.isHappy(4)); }
}
