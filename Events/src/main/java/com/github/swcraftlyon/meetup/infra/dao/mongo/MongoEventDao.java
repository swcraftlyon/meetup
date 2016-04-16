package com.github.swcraftlyon.meetup.infra.dao.mongo;

import com.github.swcraftlyon.meetup.infra.dao.EventDAO;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


public class MongoEventDao implements EventDAO<Document> {


    public static final String EVENT_COLLECTION = "event_collection";
    private MongoCollection<Document> eventCollection;

    public MongoEventDao(final MongoDatabase mongoDatabase) {
        eventCollection = mongoDatabase.getCollection(EVENT_COLLECTION);
    }

    @Override
    public void save(Document document) {
        eventCollection.insertOne(document);
    }

    @Override
    public List<Document> find() {
        List<Document> documentsToReturn = new ArrayList<Document>();
        final FindIterable<Document> documents = eventCollection.find();
        for (Document document : documents) {
            documentsToReturn.add(document);
        }
        return documentsToReturn;
    }

    @Override
    public Document findByKey(String key, String value) {
        return eventCollection.find(Filters.eq(key, value)).first();
    }
}
