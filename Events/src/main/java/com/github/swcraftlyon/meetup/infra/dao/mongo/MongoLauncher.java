package com.github.swcraftlyon.meetup.infra.dao.mongo;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoLauncher{

    private static MongoClient mongoClient;
    private static MongoDatabase mongoDatabase;

    public static synchronized MongoClient getMongoClient(MongoConfiguration mongoConfiguration){
        if (mongoClient==null){
            String uri = new String("mongodb://").concat(mongoConfiguration.getDataBaseHost())
              .concat(":").concat(mongoConfiguration.getDataBasePort());

            mongoClient = new MongoClient(new MongoClientURI(uri));
        }
        return mongoClient;
    }

    public static synchronized MongoDatabase getMongoDatabase(MongoConfiguration mongoConfiguration) {
        if(mongoDatabase == null){
            mongoDatabase = getMongoClient(mongoConfiguration).getDatabase(mongoConfiguration.getDataBaseName());
        }
        return mongoDatabase;
    }
}
