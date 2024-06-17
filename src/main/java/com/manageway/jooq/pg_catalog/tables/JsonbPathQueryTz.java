/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables;


import com.manageway.jooq.pg_catalog.PgCatalog;
import com.manageway.jooq.pg_catalog.tables.records.JsonbPathQueryTzRecord;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonbPathQueryTz extends TableImpl<JsonbPathQueryTzRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.jsonb_path_query_tz</code>
     */
    public static final JsonbPathQueryTz JSONB_PATH_QUERY_TZ = new JsonbPathQueryTz();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbPathQueryTzRecord> getRecordType() {
        return JsonbPathQueryTzRecord.class;
    }

    /**
     * The column
     * <code>pg_catalog.jsonb_path_query_tz.jsonb_path_query_tz</code>.
     */
    public final TableField<JsonbPathQueryTzRecord, JSONB> JSONB_PATH_QUERY_TZ_ = createField(DSL.name("jsonb_path_query_tz"), SQLDataType.JSONB, this, "");

    private JsonbPathQueryTz(Name alias, Table<JsonbPathQueryTzRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB),
            DSL.val(null, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\"")),
            DSL.val(null, SQLDataType.JSONB.defaultValue(DSL.field(DSL.raw("'{}'::jsonb"), SQLDataType.JSONB))),
            DSL.val(null, SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)))
        });
    }

    private JsonbPathQueryTz(Name alias, Table<JsonbPathQueryTzRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private JsonbPathQueryTz(Name alias, Table<JsonbPathQueryTzRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_path_query_tz</code> table
     * reference
     */
    public JsonbPathQueryTz(String alias) {
        this(DSL.name(alias), JSONB_PATH_QUERY_TZ);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_path_query_tz</code> table
     * reference
     */
    public JsonbPathQueryTz(Name alias) {
        this(alias, JSONB_PATH_QUERY_TZ);
    }

    /**
     * Create a <code>pg_catalog.jsonb_path_query_tz</code> table reference
     */
    public JsonbPathQueryTz() {
        this(DSL.name("jsonb_path_query_tz"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonbPathQueryTz as(String alias) {
        return new JsonbPathQueryTz(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonbPathQueryTz as(Name alias) {
        return new JsonbPathQueryTz(alias, this, parameters);
    }

    @Override
    public JsonbPathQueryTz as(Table<?> alias) {
        return new JsonbPathQueryTz(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbPathQueryTz rename(String name) {
        return new JsonbPathQueryTz(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbPathQueryTz rename(Name name) {
        return new JsonbPathQueryTz(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbPathQueryTz rename(Table<?> name) {
        return new JsonbPathQueryTz(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonbPathQueryTz call(
          JSONB target
        , Object path
        , JSONB vars
        , Boolean silent
    ) {
        JsonbPathQueryTz result = new JsonbPathQueryTz(DSL.name("jsonb_path_query_tz"), null, new Field[] {
            DSL.val(target, SQLDataType.JSONB),
            DSL.val(path, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\"")),
            DSL.val(vars, SQLDataType.JSONB.defaultValue(DSL.field(DSL.raw("'{}'::jsonb"), SQLDataType.JSONB))),
            DSL.val(silent, SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonbPathQueryTz call(
          Field<JSONB> target
        , Field<Object> path
        , Field<JSONB> vars
        , Field<Boolean> silent
    ) {
        JsonbPathQueryTz result = new JsonbPathQueryTz(DSL.name("jsonb_path_query_tz"), null, new Field[] {
            target,
            path,
            vars,
            silent
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}