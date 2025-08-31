package com.jadecross.guestbook;

import static org.junit.jupiter.api.Assertions.assertEquals; import org.junit.jupiter.api.Test;

class PostTest {
    @Test
    void testSetName() {
        Post post = new Post("TESTER", "2025-08-31 10:01:48", "Happy Wedding");
        post.setName("DEVOPS");
        assertEquals("DEVOPS",  post.getName());
    }
}

