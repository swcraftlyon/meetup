package com.github.swcraftlyon.meetup.domain.services;

import com.github.swcraftlyon.meetup.domain.Planner;
import com.github.swcraftlyon.meetup.domain.entities.Event;


public class EventManager implements IEventManager {

    private final Planner planner;

    public EventManager(Planner planner) {
        this.planner = planner;
    }

    @Override
    public Event initialiseAnEvent(String eventTitle) {
        Event event = new Event(eventTitle);
        planner.record(event);
        return event;
    }
}
