package com.manageway.repository.interfaces;

import com.manageway.domain.PersistenceEntity;


public interface BaseRepository<T extends PersistenceEntity> {

    T save(T entity);

    T update(T entity);

    void delete(T entity);
}
