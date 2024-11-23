package com.manageway.application.repository.impl;

import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.PersistenceEntity;
import com.manageway.domain.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AbstractBaseRepositoryImpl<T extends PersistenceEntity>
        extends JpaRepository<T, Id>, BaseRepository<T> {

    @Override
    default T find(Id id) {
        return findById(id).orElse(null);
    }

    @Override
    default T persist(T entity) {
        entity.validate();

        return save(entity);
    }

    @Override
    default T update(T entity) {
        entity.validate();
        entity.updateEntity();
        return saveAndFlush(entity);
    }

    @Override
    default void delete(T entity) {
        entity.deleteEntity();
        save(entity);
    }
}
