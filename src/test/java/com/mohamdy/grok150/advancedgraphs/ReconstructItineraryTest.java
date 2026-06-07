package com.mohamdy.grok150.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReconstructItineraryTest {
    private final ReconstructItinerary sol = new ReconstructItinerary();

    @Test void example() {
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"),
                sol.findItinerary(List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"),
                        List.of("SFO", "SJC"), List.of("LHR", "SFO"))));
    }
    @Test void lexicalOrder() {
        assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
                sol.findItinerary(List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"),
                        List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO"))));
    }
    @Test void singleTicket() {
        assertEquals(List.of("JFK", "ATL"), sol.findItinerary(List.of(List.of("JFK", "ATL"))));
    }
}
