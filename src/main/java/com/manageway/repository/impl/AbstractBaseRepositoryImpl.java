package com.manageway.repository.impl;

import com.manageway.domain.PersistenceEntity;
import com.manageway.repository.interfaces.BaseRepository;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.jooq.UpdatableRecord;

public class AbstractBaseRepositoryImpl<T extends PersistenceEntity>
        implements BaseRepository<T> {
    protected final DSLContext dslContext;
    private final Table<? extends UpdatableRecord<?>> table;
    private final Class<T> tClass;

    protected AbstractBaseRepositoryImpl(DSLContext dslContext, Table<? extends UpdatableRecord<?>> table, Class<T> tClass) {
        this.dslContext = dslContext;
        this.table = table;
        this.tClass = tClass;
    }

    @Override
    public T save(T entity) {
        entity.validate();
        var record = entity.toRecord();

        dslContext.insertInto(table)
                .set(record)
                .returning()
                .fetchOne();

        return entity;
    }

    @Override
    public T update(T entity) {
        return entity;
    }

    @Override
    public void delete(T entity) {

    }
}
