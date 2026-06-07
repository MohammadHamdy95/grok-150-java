package com.mohamdy.blind75.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TwitterTest {
    @Test void example() {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        assertEquals(List.of(5), twitter.getNewsFeed(1));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        assertEquals(List.of(6, 5), twitter.getNewsFeed(1));
        twitter.unfollow(1, 2);
        assertEquals(List.of(5), twitter.getNewsFeed(1));
    }
}
