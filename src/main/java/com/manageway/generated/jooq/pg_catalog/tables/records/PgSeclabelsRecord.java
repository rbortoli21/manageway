/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.pg_catalog.tables.records;


import com.manageway.generated.jooq.pg_catalog.tables.PgSeclabels;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgSeclabelsRecord extends TableRecordImpl<PgSeclabelsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objoid</code>.
     */
    public void setObjoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objoid</code>.
     */
    public Long getObjoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.classoid</code>.
     */
    public void setClassoid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.classoid</code>.
     */
    public Long getClassoid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objtype</code>.
     */
    public void setObjtype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objtype</code>.
     */
    public String getObjtype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objnamespace</code>.
     */
    public void setObjnamespace(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objnamespace</code>.
     */
    public Long getObjnamespace() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objname</code>.
     */
    public void setObjname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objname</code>.
     */
    public String getObjname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.provider</code>.
     */
    public void setProvider(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.provider</code>.
     */
    public String getProvider() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.label</code>.
     */
    public void setLabel(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.label</code>.
     */
    public String getLabel() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSeclabelsRecord
     */
    public PgSeclabelsRecord() {
        super(PgSeclabels.PG_SECLABELS);
    }

    /**
     * Create a detached, initialised PgSeclabelsRecord
     */
    public PgSeclabelsRecord(Long objoid, Long classoid, Integer objsubid, String objtype, Long objnamespace, String objname, String provider, String label) {
        super(PgSeclabels.PG_SECLABELS);

        setObjoid(objoid);
        setClassoid(classoid);
        setObjsubid(objsubid);
        setObjtype(objtype);
        setObjnamespace(objnamespace);
        setObjname(objname);
        setProvider(provider);
        setLabel(label);
        resetChangedOnNotNull();
    }
}