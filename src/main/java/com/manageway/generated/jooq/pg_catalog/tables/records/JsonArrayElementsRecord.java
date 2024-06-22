/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.pg_catalog.tables.records;


import com.manageway.generated.jooq.pg_catalog.tables.JsonArrayElements;

import org.jooq.JSON;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonArrayElementsRecord extends TableRecordImpl<JsonArrayElementsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.json_array_elements.value</code>.
     */
    public void setValue(JSON value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_array_elements.value</code>.
     */
    public JSON getValue() {
        return (JSON) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonArrayElementsRecord
     */
    public JsonArrayElementsRecord() {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);
    }

    /**
     * Create a detached, initialised JsonArrayElementsRecord
     */
    public JsonArrayElementsRecord(JSON value) {
        super(JsonArrayElements.JSON_ARRAY_ELEMENTS);

        setValue(value);
        resetChangedOnNotNull();
    }
}