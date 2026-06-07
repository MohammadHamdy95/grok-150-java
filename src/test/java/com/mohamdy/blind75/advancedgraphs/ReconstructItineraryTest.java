package com.mohamdy.blind75.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReconstructItineraryTest {
    ReconstructItinerary sol = new ReconstructItinerary();

    @Test void example() {
        List<List<String>> tickets = List.of(
            List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"), List.of("LHR", "SFO"));
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), sol.findItinerary(tickets));
    }
}
