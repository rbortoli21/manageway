/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.pg_catalog.tables.records;


import com.manageway.generated.jooq.pg_catalog.tables.PgRewrite;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgRewriteRecord extends UpdatableRecordImpl<PgRewriteRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_rewrite.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.rulename</code>.
     */
    public void setRulename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.rulename</code>.
     */
    public String getRulename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.ev_class</code>.
     */
    public void setEvClass(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.ev_class</code>.
     */
    public Long getEvClass() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.ev_type</code>.
     */
    public void setEvType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.ev_type</code>.
     */
    public String getEvType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.ev_enabled</code>.
     */
    public void setEvEnabled(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.ev_enabled</code>.
     */
    public String getEvEnabled() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.is_instead</code>.
     */
    public void setIsInstead(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.is_instead</code>.
     */
    public Boolean getIsInstead() {
        return (Boolean) get(5);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setEvQual(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getEvQual() {
        return get(6);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setEvAction(Object value) {
        set(7, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getEvAction() {
        return get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgRewriteRecord
     */
    public PgRewriteRecord() {
        super(PgRewrite.PG_REWRITE);
    }

    /**
     * Create a detached, initialised PgRewriteRecord
     */
    public PgRewriteRecord(Long oid, String rulename, Long evClass, String evType, String evEnabled, Boolean isInstead, Object evQual, Object evAction) {
        super(PgRewrite.PG_REWRITE);

        setOid(oid);
        setRulename(rulename);
        setEvClass(evClass);
        setEvType(evType);
        setEvEnabled(evEnabled);
        setIsInstead(isInstead);
        setEvQual(evQual);
        setEvAction(evAction);
        resetChangedOnNotNull();
    }
}