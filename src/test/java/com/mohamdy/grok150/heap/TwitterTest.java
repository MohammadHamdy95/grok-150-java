package com.mohamdy.grok150.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TwitterTest {
    @Test void selfFeed() {
        Twitter t = new Twitter();
        t.postTweet(1, 5);
        assertEquals(List.of(5), t.getNewsFeed(1));
    }
    @Test void followAndUnfollow() {
        Twitter t = new Twitter();
        t.postTweet(1, 5);
        t.follow(1, 2);
        t.postTweet(2, 6);
        assertEquals(List.of(6, 5), t.getNewsFeed(1));
        t.unfollow(1, 2);
        assertEquals(List.of(5), t.getNewsFeed(1));
    }
    @Test void emptyFeed() {
        Twitter t = new Twitter();
        assertEquals(List.of(), t.getNewsFeed(99));
    }
    @Test void mostRecentFirst() {
        Twitter t = new Twitter();
        t.postTweet(1, 1);
        t.postTweet(1, 2);
        t.postTweet(1, 3);
        assertEquals(List.of(3, 2, 1), t.getNewsFeed(1));
    }
}
