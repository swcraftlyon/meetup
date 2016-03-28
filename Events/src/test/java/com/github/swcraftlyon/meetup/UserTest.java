package com.github.swcraftlyon.meetup;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User("username");
        assertThat(user.getUserName()).isEqualTo("username");
    }
}
