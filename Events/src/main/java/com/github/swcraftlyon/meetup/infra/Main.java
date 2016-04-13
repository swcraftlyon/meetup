package com.github.swcraftlyon.meetup.infra;

import com.github.swcraftlyon.meetup.domain.IPlanner;
import com.github.swcraftlyon.meetup.domain.entities.Event;
import com.github.swcraftlyon.meetup.domain.services.EventManager;
import com.github.swcraftlyon.meetup.domain.services.IEventManager;
import com.github.swcraftlyon.meetup.infra.adapters.repositories.PlannerRepository;
import com.github.swcraftlyon.meetup.infra.dao.IEventDAO;
import com.github.swcraftlyon.meetup.infra.dao.MangoEventDao;


public class Main {

    public static void main(String[] args) {

        ApplicationConfig.getStartupMessage();
        //Infra
        IEventDAO eventDAO = new MangoEventDao();
        //Adapter
        IPlanner planner = new PlannerRepository(eventDAO);
        // Domain Model
        IEventManager eventManager = new EventManager(planner);
        Event event = eventManager.initialiseAnEvent("Mix-it Lyon");

    }
}
