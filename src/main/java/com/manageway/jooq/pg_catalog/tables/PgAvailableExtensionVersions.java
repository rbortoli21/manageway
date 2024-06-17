/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables;


import com.manageway.jooq.pg_catalog.PgCatalog;
import com.manageway.jooq.pg_catalog.tables.records.PgAvailableExtensionVersionsRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgAvailableExtensionVersions extends TableImpl<PgAvailableExtensionVersionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_available_extension_versions</code>
     */
    public static final PgAvailableExtensionVersions PG_AVAILABLE_EXTENSION_VERSIONS = new PgAvailableExtensionVersions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAvailableExtensionVersionsRecord> getRecordType() {
        return PgAvailableExtensionVersionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_available_extension_versions.name</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.version</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> VERSION = createField(DSL.name("version"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.installed</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> INSTALLED = createField(DSL.name("installed"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.superuser</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> SUPERUSER = createField(DSL.name("superuser"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.trusted</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> TRUSTED = createField(DSL.name("trusted"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.relocatable</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> RELOCATABLE = createField(DSL.name("relocatable"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.schema</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> SCHEMA = createField(DSL.name("schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.requires</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String[]> REQUIRES = createField(DSL.name("requires"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.comment</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.CLOB, this, "");

    private PgAvailableExtensionVersions(Name alias, Table<PgAvailableExtensionVersionsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgAvailableExtensionVersions(Name alias, Table<PgAvailableExtensionVersionsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_available_extension_versions" as  SELECT e.name,
         e.version,
         (x.extname IS NOT NULL) AS installed,
         e.superuser,
         e.trusted,
         e.relocatable,
         e.schema,
         e.requires,
         e.comment
        FROM (pg_available_extension_versions() e(name, version, superuser, trusted, relocatable, schema, requires, comment)
          LEFT JOIN pg_extension x ON (((e.name = x.extname) AND (e.version = x.extversion))));
        """), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extension_versions</code>
     * table reference
     */
    public PgAvailableExtensionVersions(String alias) {
        this(DSL.name(alias), PG_AVAILABLE_EXTENSION_VERSIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extension_versions</code>
     * table reference
     */
    public PgAvailableExtensionVersions(Name alias) {
        this(alias, PG_AVAILABLE_EXTENSION_VERSIONS);
    }

    /**
     * Create a <code>pg_catalog.pg_available_extension_versions</code> table
     * reference
     */
    public PgAvailableExtensionVersions() {
        this(DSL.name("pg_available_extension_versions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgAvailableExtensionVersions as(String alias) {
        return new PgAvailableExtensionVersions(DSL.name(alias), this);
    }

    @Override
    public PgAvailableExtensionVersions as(Name alias) {
        return new PgAvailableExtensionVersions(alias, this);
    }

    @Override
    public PgAvailableExtensionVersions as(Table<?> alias) {
        return new PgAvailableExtensionVersions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensionVersions rename(String name) {
        return new PgAvailableExtensionVersions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensionVersions rename(Name name) {
        return new PgAvailableExtensionVersions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensionVersions rename(Table<?> name) {
        return new PgAvailableExtensionVersions(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAvailableExtensionVersions where(Condition condition) {
        return new PgAvailableExtensionVersions(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAvailableExtensionVersions where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAvailableExtensionVersions where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAvailableExtensionVersions where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAvailableExtensionVersions where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAvailableExtensionVersions where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAvailableExtensionVersions where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAvailableExtensionVersions where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAvailableExtensionVersions whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAvailableExtensionVersions whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}