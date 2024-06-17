/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables.records;


import com.manageway.jooq.pg_catalog.tables.PgAggregate;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgAggregateRecord extends UpdatableRecordImpl<PgAggregateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfnoid</code>.
     */
    public void setAggfnoid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfnoid</code>.
     */
    public String getAggfnoid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggkind</code>.
     */
    public void setAggkind(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggkind</code>.
     */
    public String getAggkind() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggnumdirectargs</code>.
     */
    public void setAggnumdirectargs(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggnumdirectargs</code>.
     */
    public Short getAggnumdirectargs() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggtransfn</code>.
     */
    public void setAggtransfn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggtransfn</code>.
     */
    public String getAggtransfn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfinalfn</code>.
     */
    public void setAggfinalfn(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfinalfn</code>.
     */
    public String getAggfinalfn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggcombinefn</code>.
     */
    public void setAggcombinefn(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggcombinefn</code>.
     */
    public String getAggcombinefn() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggserialfn</code>.
     */
    public void setAggserialfn(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggserialfn</code>.
     */
    public String getAggserialfn() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggdeserialfn</code>.
     */
    public void setAggdeserialfn(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggdeserialfn</code>.
     */
    public String getAggdeserialfn() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmtransfn</code>.
     */
    public void setAggmtransfn(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmtransfn</code>.
     */
    public String getAggmtransfn() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggminvtransfn</code>.
     */
    public void setAggminvtransfn(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggminvtransfn</code>.
     */
    public String getAggminvtransfn() {
        return (String) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmfinalfn</code>.
     */
    public void setAggmfinalfn(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmfinalfn</code>.
     */
    public String getAggmfinalfn() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfinalextra</code>.
     */
    public void setAggfinalextra(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfinalextra</code>.
     */
    public Boolean getAggfinalextra() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmfinalextra</code>.
     */
    public void setAggmfinalextra(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmfinalextra</code>.
     */
    public Boolean getAggmfinalextra() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfinalmodify</code>.
     */
    public void setAggfinalmodify(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfinalmodify</code>.
     */
    public String getAggfinalmodify() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmfinalmodify</code>.
     */
    public void setAggmfinalmodify(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmfinalmodify</code>.
     */
    public String getAggmfinalmodify() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggsortop</code>.
     */
    public void setAggsortop(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggsortop</code>.
     */
    public Long getAggsortop() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggtranstype</code>.
     */
    public void setAggtranstype(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggtranstype</code>.
     */
    public Long getAggtranstype() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggtransspace</code>.
     */
    public void setAggtransspace(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggtransspace</code>.
     */
    public Integer getAggtransspace() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmtranstype</code>.
     */
    public void setAggmtranstype(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmtranstype</code>.
     */
    public Long getAggmtranstype() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmtransspace</code>.
     */
    public void setAggmtransspace(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmtransspace</code>.
     */
    public Integer getAggmtransspace() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.agginitval</code>.
     */
    public void setAgginitval(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.agginitval</code>.
     */
    public String getAgginitval() {
        return (String) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggminitval</code>.
     */
    public void setAggminitval(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggminitval</code>.
     */
    public String getAggminitval() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAggregateRecord
     */
    public PgAggregateRecord() {
        super(PgAggregate.PG_AGGREGATE);
    }

    /**
     * Create a detached, initialised PgAggregateRecord
     */
    public PgAggregateRecord(String aggfnoid, String aggkind, Short aggnumdirectargs, String aggtransfn, String aggfinalfn, String aggcombinefn, String aggserialfn, String aggdeserialfn, String aggmtransfn, String aggminvtransfn, String aggmfinalfn, Boolean aggfinalextra, Boolean aggmfinalextra, String aggfinalmodify, String aggmfinalmodify, Long aggsortop, Long aggtranstype, Integer aggtransspace, Long aggmtranstype, Integer aggmtransspace, String agginitval, String aggminitval) {
        super(PgAggregate.PG_AGGREGATE);

        setAggfnoid(aggfnoid);
        setAggkind(aggkind);
        setAggnumdirectargs(aggnumdirectargs);
        setAggtransfn(aggtransfn);
        setAggfinalfn(aggfinalfn);
        setAggcombinefn(aggcombinefn);
        setAggserialfn(aggserialfn);
        setAggdeserialfn(aggdeserialfn);
        setAggmtransfn(aggmtransfn);
        setAggminvtransfn(aggminvtransfn);
        setAggmfinalfn(aggmfinalfn);
        setAggfinalextra(aggfinalextra);
        setAggmfinalextra(aggmfinalextra);
        setAggfinalmodify(aggfinalmodify);
        setAggmfinalmodify(aggmfinalmodify);
        setAggsortop(aggsortop);
        setAggtranstype(aggtranstype);
        setAggtransspace(aggtransspace);
        setAggmtranstype(aggmtranstype);
        setAggmtransspace(aggmtransspace);
        setAgginitval(agginitval);
        setAggminitval(aggminitval);
        resetChangedOnNotNull();
    }
}