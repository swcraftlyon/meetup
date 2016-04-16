package com.github.swcraftlyon.meetup.infra.dao;

import com.github.swcraftlyon.meetup.infra.dao.mongo.MongoEventDao;
import org.bson.Document;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MongoEventDaoTest {

    public static final String DID_YOU_PERSIST = "Did You Persist ?";
    public static final String YES_I_DID = "Yes i Did.";

    private EventDAO eventDAO;

    @Before
    public void setUp() throws Exception {
        eventDAO = new MongoEventDao(FongoLauncher.getMongoDatabase());
    }

    @Test
    public void shouldPersistWhenCallingSaveMethod() throws Exception {

        Document documentToSave = new Document();
        documentToSave.append(DID_YOU_PERSIST, YES_I_DID);
        eventDAO.save(documentToSave);

        Document documentSaved = (Document) eventDAO.findByKey(DID_YOU_PERSIST,YES_I_DID);
        Assert.assertEquals(documentSaved.get(DID_YOU_PERSIST, String.class), documentToSave.get(DID_YOU_PERSIST, String.class));
    }

    @Test
    public void shouldFindAtLeastOneEventWhenWeSaveOne() throws Exception {
        Document documentToSave = new Document();
        documentToSave.append(DID_YOU_PERSIST, YES_I_DID);
        eventDAO.save(documentToSave);

        final List<Document> results = eventDAO.find();
        Assert.assertNotNull(results);
        Assert.assertTrue(results.size() > 0);
    }

    @After
    public void tearDown() throws Exception {
        FongoLauncher.getMongoDatabase().drop();
    }
}
