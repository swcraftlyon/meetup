package com.github.swcraftlyon.meetup.infra.repositories;

import com.github.swcraftlyon.meetup.domain.IPlanner;
import com.github.swcraftlyon.meetup.domain.entities.Event;
import org.junit.Test;
import org.mockito.Mockito;


public class PlannerRepositoryTest {

    @Test
    public void shouldRecordAnEvent() throws Exception {
        IPlanner planner = Mockito.mock(IPlanner.class);
        Event event = new Event("Mix-it Lyon");
        planner.record(event);
        Mockito.verify(planner).record(event);
    }
}
