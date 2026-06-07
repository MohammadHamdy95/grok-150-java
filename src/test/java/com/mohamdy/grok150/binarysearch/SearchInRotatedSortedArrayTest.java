package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SearchInRotatedSortedArrayTest {
    private final SearchInRotatedSortedArray sol = new SearchInRotatedSortedArray();

    @Test void foundRight() { assertEquals(4, sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); }
    @Test void foundLeft() { assertEquals(0, sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4)); }
    @Test void notFound() { assertEquals(-1, sol.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); }
    @Test void single() { assertEquals(0, sol.search(new int[]{1}, 1)); }
    @Test void singleMiss() { assertEquals(-1, sol.search(new int[]{1}, 0)); }
    @Test void notRotated() { assertEquals(2, sol.search(new int[]{1, 2, 3, 4, 5}, 3)); }
}
