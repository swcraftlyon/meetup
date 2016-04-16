package com.github.swcraftlyon.meetup.infra.dao.mongo;

public class MongoConfiguration {

    private String dataBaseName;
    private String dataBaseHost;
    private String dataBasePort;

    public MongoConfiguration(String dataBaseHost, String dataBasePort, String dataBaseName) {
        this.dataBaseName = dataBaseName;
        this.dataBaseHost = dataBaseHost;
        this.dataBasePort = dataBasePort;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public String getDataBaseHost() {
        return dataBaseHost;
    }

    public String getDataBasePort() {
        return dataBasePort;
    }
}
