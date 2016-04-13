package com.github.swcraftlyon.meetup.domain.services;

import com.github.swcraftlyon.meetup.domain.IPlanner;
import com.github.swcraftlyon.meetup.domain.entities.Event;


public class EventManager implements IEventManager {

    private final IPlanner planner;

    public EventManager(IPlanner planner) {
        this.planner = planner;
    }

    @Override
    public Event initialiseAnEvent(String eventTitle) {
        Event event = new Event(eventTitle);
        planner.record(event);
        return event;
    }
}
