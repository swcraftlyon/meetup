package com.github.swcraftlyon.meetup.infra.dao;

import org.bson.Document;


public interface IEventDAO {

    void persist(Document document);
}
