package com.github.swcraftlyon.meetup;

import com.google.gson.Gson;

import java.util.Collections;

import static spark.Spark.get;

public class Application {
    public static void main(String[] args) {
        Gson gson = new Gson();
        get("/events",
          (request, response) -> {
              response.type("application/json");
              return Collections.singletonList(new Event("Dépassons le kata"));
          },
          gson::toJson);
        System.out.println("Events on http://localhost:4567/events");
    }
}
