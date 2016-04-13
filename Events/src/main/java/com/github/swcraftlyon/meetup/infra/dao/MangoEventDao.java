package com.github.swcraftlyon.meetup.infra.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class MangoEventDao implements IEventDAO {

    public static final String EVENT_DB = "EventDB";
    public static final String MONGODB_LOCALHOST_27017 = "mongodb://localhost:27017";
    public static final String COLLECTION_EVENTS = "events";

    private static MongoClient mongoClient;

    @Override
    public void persist(Document document) {

        MongoDatabase database = getDataBase();
        MongoCollection<Document> eventCollection = database.getCollection(COLLECTION_EVENTS);

        eventCollection.insertOne(document);
        this.closeDataBase();

    }

    public static synchronized MongoDatabase getDataBase(){
        if(mongoClient == null){
            mongoClient = new MongoClient(new MongoClientURI(MONGODB_LOCALHOST_27017));
        }
        return mongoClient.getDatabase(EVENT_DB);
    }

    private void closeDataBase(){
        if(mongoClient != null){
            mongoClient.close();
        }
    }
}
