package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BinarySearchTest {
    BinarySearch sol = new BinarySearch();

    @Test void found() { assertEquals(4, sol.search(new int[]{-1,0,3,5,9,12}, 9)); }
    @Test void notFound() { assertEquals(-1, sol.search(new int[]{-1,0,3,5,9,12}, 2)); }
}
