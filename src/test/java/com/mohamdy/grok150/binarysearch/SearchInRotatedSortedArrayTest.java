package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray sol = new SearchInRotatedSortedArray();

    @Test void found() { assertEquals(4, sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); }
    @Test void notFound() { assertEquals(-1, sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); }
}
