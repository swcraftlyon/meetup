package com.github.swcraftlyon.meetup.infra.dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.junit.Assert;
import org.junit.Test;


public class MangoEventDaoTest {


    @Test
    public void shouldGetMangoDataBase() throws Exception {
        Assert.assertNotNull(MangoEventDao.getDataBase());
    }

    @Test
    public void shouldPersistInDataBase() throws Exception {
        MongoDatabase mongoDatabase = MangoEventDao.getDataBase();
        MongoCollection<Document> testCollection = mongoDatabase.getCollection("Test_Collection");

        Document document = new Document();
        document.append("Test","Do you persist ?");
        document.append("OK","Yes I'm OK");
        testCollection.insertOne(document);

        FindIterable<Document> results = testCollection.find(Filters.eq("Test","Do you persist ?"));
        Assert.assertEquals(results.first().get("OK"),"Yes I'm OK");

    }

}
