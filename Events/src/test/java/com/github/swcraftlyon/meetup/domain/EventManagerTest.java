package com.github.swcraftlyon.meetup.domain;

import com.github.swcraftlyon.meetup.domain.entities.Event;
import com.github.swcraftlyon.meetup.domain.services.EventManager;
import com.github.swcraftlyon.meetup.domain.services.IEventManager;
import org.junit.Assert;
import org.mockito.Mockito;
import org.junit.Test;



public class EventManagerTest {

    @Test
    public void shouldCreateAnEvent() throws Exception {
        Planner planner = Mockito.mock(Planner.class);
        IEventManager eventManager = new EventManager(planner);
        Event event = eventManager.initialiseAnEvent("Mix-it Lyon");
        Assert.assertEquals(event.getTitle(),"Mix-it Lyon");
    }
}
