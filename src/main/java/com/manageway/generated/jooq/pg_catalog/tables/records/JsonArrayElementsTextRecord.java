/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.pg_catalog.tables.records;


import com.manageway.generated.jooq.pg_catalog.tables.JsonArrayElementsText;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonArrayElementsTextRecord extends TableRecordImpl<JsonArrayElementsTextRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.json_array_elements_text.value</code>.
     */
    public void setValue(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_array_elements_text.value</code>.
     */
    public String getValue() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonArrayElementsTextRecord
     */
    public JsonArrayElementsTextRecord() {
        super(JsonArrayElementsText.JSON_ARRAY_ELEMENTS_TEXT);
    }

    /**
     * Create a detached, initialised JsonArrayElementsTextRecord
     */
    public JsonArrayElementsTextRecord(String value) {
        super(JsonArrayElementsText.JSON_ARRAY_ELEMENTS_TEXT);

        setValue(value);
        resetChangedOnNotNull();
    }
}