package com.github.swcraftlyon.meetup.infra;

import com.github.swcraftlyon.meetup.domain.Planner;
import com.github.swcraftlyon.meetup.domain.entities.Event;
import com.github.swcraftlyon.meetup.domain.services.EventManager;
import com.github.swcraftlyon.meetup.domain.services.IEventManager;
import com.github.swcraftlyon.meetup.infra.adapters.repositories.PlannerRepository;
import com.github.swcraftlyon.meetup.infra.dao.EventDAO;
import com.github.swcraftlyon.meetup.infra.dao.mongo.MongoConfiguration;
import com.github.swcraftlyon.meetup.infra.dao.mongo.MongoEventDao;
import com.github.swcraftlyon.meetup.infra.dao.mongo.MongoLauncher;


public class Main {

    public static void main(String[] args) {
        MongoConfiguration mongoConfiguration = new MongoConfiguration("localhost", "27017", "MeetupDB");
        //Infra
        EventDAO eventDAO = new MongoEventDao(MongoLauncher.getMongoDatabase(mongoConfiguration));
        //Adapter
        Planner planner = new PlannerRepository(eventDAO);
        // Domain Model
        IEventManager eventManager = new EventManager(planner);

        Event event = eventManager.initialiseAnEvent("Mix-it Lyon");
        System.out.println("Event : " + event.getTitle() + " is created.");
    }
}
