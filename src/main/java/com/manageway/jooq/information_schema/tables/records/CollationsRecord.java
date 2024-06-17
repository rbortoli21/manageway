/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.information_schema.tables.records;


import com.manageway.jooq.information_schema.tables.Collations;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CollationsRecord extends TableRecordImpl<CollationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.collations.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.collations.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.collations.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.collations.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.collations.pad_attribute</code>.
     */
    public void setPadAttribute(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.collations.pad_attribute</code>.
     */
    public String getPadAttribute() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollationsRecord
     */
    public CollationsRecord() {
        super(Collations.COLLATIONS);
    }

    /**
     * Create a detached, initialised CollationsRecord
     */
    public CollationsRecord(String collationCatalog, String collationSchema, String collationName, String padAttribute) {
        super(Collations.COLLATIONS);

        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setPadAttribute(padAttribute);
        resetChangedOnNotNull();
    }
}