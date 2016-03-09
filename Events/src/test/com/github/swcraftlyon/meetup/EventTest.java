package com.github.swcraftlyon.meetup;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EventTest {

    @Test
    public void shouldUseAssertjForAssertions() {
        assertThat(true).isTrue();
    }

    @Test
    public void testEvent(){
        Event event = new Event("Title");
        assertThat(event.getTitle()).isEqualTo("Title");
    }

}