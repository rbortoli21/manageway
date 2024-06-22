/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.information_schema.tables;


import com.manageway.generated.jooq.information_schema.Domains;
import com.manageway.generated.jooq.information_schema.InformationSchema;
import com.manageway.generated.jooq.information_schema.tables.records.ColumnUdtUsageRecord;

import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ColumnUdtUsage extends TableImpl<ColumnUdtUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.column_udt_usage</code>
     */
    public static final ColumnUdtUsage COLUMN_UDT_USAGE = new ColumnUdtUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnUdtUsageRecord> getRecordType() {
        return ColumnUdtUsageRecord.class;
    }

    /**
     * The column <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_NAME = createField(DSL.name("udt_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_schema</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.column_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ColumnUdtUsage(Name alias, Table<ColumnUdtUsageRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ColumnUdtUsage(Name alias, Table<ColumnUdtUsageRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "column_udt_usage" as  SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,
          (COALESCE(nbt.nspname, nt.nspname))::information_schema.sql_identifier AS udt_schema,
          (COALESCE(bt.typname, t.typname))::information_schema.sql_identifier AS udt_name,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (a.attname)::information_schema.sql_identifier AS column_name
         FROM pg_attribute a,
          pg_class c,
          pg_namespace nc,
          ((pg_type t
           JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))
           LEFT JOIN (pg_type bt
           JOIN pg_namespace nbt ON ((bt.typnamespace = nbt.oid))) ON (((t.typtype = 'd'::"char") AND (t.typbasetype = bt.oid))))
        WHERE ((a.attrelid = c.oid) AND (a.atttypid = t.oid) AND (nc.oid = c.relnamespace) AND (a.attnum > 0) AND (NOT a.attisdropped) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND pg_has_role(COALESCE(bt.typowner, t.typowner), 'USAGE'::text));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table
     * reference
     */
    public ColumnUdtUsage(String alias) {
        this(DSL.name(alias), COLUMN_UDT_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table
     * reference
     */
    public ColumnUdtUsage(Name alias) {
        this(alias, COLUMN_UDT_USAGE);
    }

    /**
     * Create a <code>information_schema.column_udt_usage</code> table reference
     */
    public ColumnUdtUsage() {
        this(DSL.name("column_udt_usage"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnUdtUsage as(String alias) {
        return new ColumnUdtUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnUdtUsage as(Name alias) {
        return new ColumnUdtUsage(alias, this);
    }

    @Override
    public ColumnUdtUsage as(Table<?> alias) {
        return new ColumnUdtUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(String name) {
        return new ColumnUdtUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(Name name) {
        return new ColumnUdtUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(Table<?> name) {
        return new ColumnUdtUsage(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnUdtUsage where(Condition condition) {
        return new ColumnUdtUsage(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnUdtUsage where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnUdtUsage where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnUdtUsage where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnUdtUsage where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnUdtUsage where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnUdtUsage where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnUdtUsage where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnUdtUsage whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnUdtUsage whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}