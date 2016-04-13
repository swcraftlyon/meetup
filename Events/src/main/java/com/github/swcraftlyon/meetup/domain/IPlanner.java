package com.github.swcraftlyon.meetup.domain;

import com.github.swcraftlyon.meetup.domain.entities.Event;


public interface IPlanner {

    void record(Event event);
}
