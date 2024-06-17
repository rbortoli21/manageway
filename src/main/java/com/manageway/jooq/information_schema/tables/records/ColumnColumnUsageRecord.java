/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.information_schema.tables.records;


import com.manageway.jooq.information_schema.tables.ColumnColumnUsage;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ColumnColumnUsageRecord extends TableRecordImpl<ColumnColumnUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.column_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.column_name</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.column_column_usage.dependent_column</code>.
     */
    public void setDependentColumn(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_column_usage.dependent_column</code>.
     */
    public String getDependentColumn() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnColumnUsageRecord
     */
    public ColumnColumnUsageRecord() {
        super(ColumnColumnUsage.COLUMN_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised ColumnColumnUsageRecord
     */
    public ColumnColumnUsageRecord(String tableCatalog, String tableSchema, String tableName, String columnName, String dependentColumn) {
        super(ColumnColumnUsage.COLUMN_COLUMN_USAGE);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setDependentColumn(dependentColumn);
        resetChangedOnNotNull();
    }
}