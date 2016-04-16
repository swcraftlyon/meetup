package com.github.swcraftlyon.meetup.infra.dao;


import com.github.fakemongo.Fongo;
import com.mongodb.client.MongoDatabase;

public class FongoLauncher{

    private static MongoDatabase mongoDatabase;

    public static synchronized MongoDatabase getMongoDatabase() {
        if(mongoDatabase == null){
            Fongo fongo = new Fongo("Fake Mongo Server");
            mongoDatabase = fongo.getDatabase("meetupTestDB");
        }
        return mongoDatabase;
    }
}
