package com.manageway.domain.repository;

import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.PersistenceEntity;


public interface BaseRepository<T extends PersistenceEntity> {
    T find(Id id);

    T persist(T entity);

    T update(T entity);

    void delete(T entity);
}
