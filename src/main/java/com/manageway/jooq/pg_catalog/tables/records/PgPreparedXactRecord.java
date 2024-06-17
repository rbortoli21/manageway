/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables.records;


import com.manageway.jooq.pg_catalog.tables.PgPreparedXact;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgPreparedXactRecord extends TableRecordImpl<PgPreparedXactRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public void setTransaction(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public Long getTransaction() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public void setGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public String getGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public void setPrepared(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public OffsetDateTime getPrepared() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public void setOwnerid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public Long getOwnerid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public void setDbid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public Long getDbid() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPreparedXactRecord
     */
    public PgPreparedXactRecord() {
        super(PgPreparedXact.PG_PREPARED_XACT);
    }

    /**
     * Create a detached, initialised PgPreparedXactRecord
     */
    public PgPreparedXactRecord(Long transaction, String gid, OffsetDateTime prepared, Long ownerid, Long dbid) {
        super(PgPreparedXact.PG_PREPARED_XACT);

        setTransaction(transaction);
        setGid(gid);
        setPrepared(prepared);
        setOwnerid(ownerid);
        setDbid(dbid);
        resetChangedOnNotNull();
    }
}