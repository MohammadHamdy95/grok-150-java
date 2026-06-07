package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class EncodeAndDecodeStringsTest {
    EncodeAndDecodeStrings sol = new EncodeAndDecodeStrings();

    @Test void roundTrip() {
        List<String> in = List.of("neet", "code", "love", "you");
        assertEquals(in, sol.decode(sol.encode(in)));
    }

    @Test void withDelimiters() {
        List<String> in = List.of("we#", "say", ":#yes");
        assertEquals(in, sol.decode(sol.encode(in)));
    }
}
