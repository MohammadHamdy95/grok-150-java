package com.mohamdy.grok150.bitmanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SingleNumberTest {
    SingleNumber sol = new SingleNumber();

    @Test void example() { assertEquals(1, sol.singleNumber(new int[]{2,2,1})); }
    @Test void example2() { assertEquals(4, sol.singleNumber(new int[]{4,1,2,1,2})); }
}
