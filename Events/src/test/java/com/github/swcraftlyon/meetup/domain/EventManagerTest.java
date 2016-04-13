package com.github.swcraftlyon.meetup.domain;

import com.github.swcraftlyon.meetup.domain.entities.Event;
import com.github.swcraftlyon.meetup.domain.services.EventManager;
import com.github.swcraftlyon.meetup.domain.services.IEventManager;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


public class EventManagerTest {

    @Test
    public void shouldCreateAnEvent() throws Exception {

        IPlanner planner = Mockito.mock(IPlanner.class);
        IEventManager eventManager = new EventManager(planner);
        Event event = eventManager.initialiseAnEvent("Mix-it Lyon");
        assertThat(event.getTitle()).isEqualTo("Mix-it Lyon");
    }
}
