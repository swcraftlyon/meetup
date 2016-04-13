package com.github.swcraftlyon.meetup.infra.adapters.repositories;

import com.github.swcraftlyon.meetup.domain.entities.Event;
import com.github.swcraftlyon.meetup.domain.IPlanner;
import com.github.swcraftlyon.meetup.infra.dao.IEventDAO;
import org.bson.Document;


public class PlannerRepository implements IPlanner {

    private final IEventDAO eventDAO;

    public PlannerRepository(IEventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Override
    public void record(Event event) {

        Document document = new Document();
        document.append("id", 1);
        document.append("title", event.getTitle());

        eventDAO.persist(document);
    }
}
