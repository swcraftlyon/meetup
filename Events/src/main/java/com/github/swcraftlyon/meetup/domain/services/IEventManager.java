package com.github.swcraftlyon.meetup.domain.services;

import com.github.swcraftlyon.meetup.domain.entities.Event;


public interface IEventManager {

    Event initialiseAnEvent(String eventTitle);
}
