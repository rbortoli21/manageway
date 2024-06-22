/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.pg_catalog.tables.records;


import com.manageway.generated.jooq.pg_catalog.tables.JsonEachText;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonEachTextRecord extends TableRecordImpl<JsonEachTextRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.json_each_text.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_each_text.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.json_each_text.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.json_each_text.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonEachTextRecord
     */
    public JsonEachTextRecord() {
        super(JsonEachText.JSON_EACH_TEXT);
    }

    /**
     * Create a detached, initialised JsonEachTextRecord
     */
    public JsonEachTextRecord(String key, String value) {
        super(JsonEachText.JSON_EACH_TEXT);

        setKey(key);
        setValue(value);
        resetChangedOnNotNull();
    }
}