package com.github.swcraftlyon.meetup.infra.dao;

import java.util.List;

public interface EventDAO<T> {

    void save(T object);

    List<T> find();

    T findByKey(String key, String valueOfKey);
}
