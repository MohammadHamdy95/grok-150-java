package com.mohamdy.grok150.mathgeometry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class HappyNumberTest {
    HappyNumber sol = new HappyNumber();

    @Test void happy() { assertTrue(sol.isHappy(19)); }
    @Test void notHappy() { assertFalse(sol.isHappy(2)); }
}
