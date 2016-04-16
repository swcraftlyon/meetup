package com.github.swcraftlyon.meetup.infra.adapters.repositories;

import com.github.swcraftlyon.meetup.domain.entities.Event;
import com.github.swcraftlyon.meetup.domain.Planner;
import com.github.swcraftlyon.meetup.infra.dao.EventDAO;
import org.bson.Document;


public class PlannerRepository implements Planner {

    private final EventDAO eventDAO;

    public PlannerRepository(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Override
    public void record(Event event) {
        Document document = new Document();
        document.append("title", event.getTitle());

        eventDAO.save(document);
    }


}
