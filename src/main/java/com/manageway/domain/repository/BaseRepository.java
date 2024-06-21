package com.manageway.domain.repository;

import com.manageway.domain.Id;
import com.manageway.domain.PersistenceEntity;


public interface BaseRepository<T extends PersistenceEntity> {

    T save(T entity);

    void update(T entity);

    T find(Id id);

    void delete(T entity);
}
