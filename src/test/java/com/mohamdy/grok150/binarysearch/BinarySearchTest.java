package com.mohamdy.grok150.binarysearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

//@Disabled("Solution not implemented yet.")
@Disabled("Solution not implemented yet.")
class BinarySearchTest {
    private final BinarySearch sol = new BinarySearch();

    @Test void found() { assertEquals(4, sol.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)); }
    @Test void notFound() { assertEquals(-1, sol.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)); }
    @Test void firstElement() { assertEquals(0, sol.search(new int[]{1, 2, 3, 4, 5}, 1)); }
    @Test void lastElement() { assertEquals(4, sol.search(new int[]{1, 2, 3, 4, 5}, 5)); }
    @Test void single() { assertEquals(0, sol.search(new int[]{7}, 7)); }
    @Test void singleMiss() { assertEquals(-1, sol.search(new int[]{7}, 3)); }
}
