package com.github.swcraftlyon.meetup.infra.repositories;

import com.github.swcraftlyon.meetup.domain.Planner;
import com.github.swcraftlyon.meetup.domain.entities.Event;
import org.junit.Test;
import org.mockito.Mockito;


public class PlannerRepositoryTest {

    @Test
    public void shouldRecordAnEventWhenCallingRecordMethod() throws Exception {
        Planner planner = Mockito.mock(Planner.class);
        Event event = new Event("Mix-it Lyon");
        planner.record(event);
        Mockito.verify(planner).record(event);
    }


}
