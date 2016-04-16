package com.github.swcraftlyon.meetup.domain.entities;


public class Event {

    private final String title;

    public Event(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
