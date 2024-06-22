package com.manageway.repository.impl;

import com.manageway.domain.Id;
import com.manageway.domain.PersistenceEntity;
import com.manageway.repository.interfaces.BaseRepository;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.jooq.impl.DSL;

import static com.manageway.domain.Id.ID;

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
        UpdatableRecord<?> record = dslContext.newRecord(table, entity);

        record.insert();

        return entity;
    }

    @Override
    public T update(T entity) {
        return entity;
    }

    @Override
    public T find(Id id) {
        if (id == null)
            return null;

        return dslContext.selectFrom(table)
                .where(DSL.field(ID).eq(id.value()))
                .fetchOneInto(tClass);

    }

    @Override
    public void delete(T entity) {

    }
}
