package com.github.swcraftlyon.meetup.domain.entities;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

    @Test
    public void shouldUseAssertjForAssertions() {
        assertThat(true).isTrue();
    }

    @Test
    public void testEvent() {
        Event event = new Event("Title");
        assertThat(event.getTitle()).isEqualTo("Title");
    }
}
