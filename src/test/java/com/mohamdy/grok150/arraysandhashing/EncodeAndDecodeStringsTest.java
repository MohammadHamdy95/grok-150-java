package com.mohamdy.grok150.arraysandhashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class EncodeAndDecodeStringsTest {
    private final EncodeAndDecodeStrings sol = new EncodeAndDecodeStrings();

    private void roundTrip(List<String> in) { assertEquals(in, sol.decode(sol.encode(in))); }

    @Test void simple() { roundTrip(List.of("neet", "code", "love", "you")); }
    @Test void withDelimiterChars() { roundTrip(List.of("we#", "say", ":#yes", "###")); }
    @Test void emptyList() { roundTrip(List.of()); }
    @Test void emptyStrings() { roundTrip(List.of("", "", "")); }
    @Test void numbersAndColons() { roundTrip(List.of("12:34", "5:6:7", "")); }
    @Test void single() { roundTrip(List.of("solo")); }
}
