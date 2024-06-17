/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables;


import com.manageway.jooq.pg_catalog.PgCatalog;
import com.manageway.jooq.pg_catalog.tables.records.PgStatioAllTablesRecord;

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
public class PgStatioAllTables extends TableImpl<PgStatioAllTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_all_tables</code>
     */
    public static final PgStatioAllTables PG_STATIO_ALL_TABLES = new PgStatioAllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioAllTablesRecord> getRecordType() {
        return PgStatioAllTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.relid</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.schemaname</code>.
     */
    public final TableField<PgStatioAllTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.relname</code>.
     */
    public final TableField<PgStatioAllTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.heap_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> HEAP_BLKS_READ = createField(DSL.name("heap_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.heap_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> HEAP_BLKS_HIT = createField(DSL.name("heap_blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.idx_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> IDX_BLKS_READ = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.idx_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> IDX_BLKS_HIT = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.toast_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TOAST_BLKS_READ = createField(DSL.name("toast_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.toast_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TOAST_BLKS_HIT = createField(DSL.name("toast_blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.tidx_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TIDX_BLKS_READ = createField(DSL.name("tidx_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.tidx_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TIDX_BLKS_HIT = createField(DSL.name("tidx_blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioAllTables(Name alias, Table<PgStatioAllTablesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgStatioAllTables(Name alias, Table<PgStatioAllTablesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_statio_all_tables" as  SELECT c.oid AS relid,
          n.nspname AS schemaname,
          c.relname,
          (pg_stat_get_blocks_fetched(c.oid) - pg_stat_get_blocks_hit(c.oid)) AS heap_blks_read,
          pg_stat_get_blocks_hit(c.oid) AS heap_blks_hit,
          i.idx_blks_read,
          i.idx_blks_hit,
          (pg_stat_get_blocks_fetched(t.oid) - pg_stat_get_blocks_hit(t.oid)) AS toast_blks_read,
          pg_stat_get_blocks_hit(t.oid) AS toast_blks_hit,
          x.idx_blks_read AS tidx_blks_read,
          x.idx_blks_hit AS tidx_blks_hit
         FROM ((((pg_class c
           LEFT JOIN pg_class t ON ((c.reltoastrelid = t.oid)))
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
           LEFT JOIN LATERAL ( SELECT (sum((pg_stat_get_blocks_fetched(pg_index.indexrelid) - pg_stat_get_blocks_hit(pg_index.indexrelid))))::bigint AS idx_blks_read,
                  (sum(pg_stat_get_blocks_hit(pg_index.indexrelid)))::bigint AS idx_blks_hit
                 FROM pg_index
                WHERE (pg_index.indrelid = c.oid)) i ON (true))
           LEFT JOIN LATERAL ( SELECT (sum((pg_stat_get_blocks_fetched(pg_index.indexrelid) - pg_stat_get_blocks_hit(pg_index.indexrelid))))::bigint AS idx_blks_read,
                  (sum(pg_stat_get_blocks_hit(pg_index.indexrelid)))::bigint AS idx_blks_hit
                 FROM pg_index
                WHERE (pg_index.indrelid = t.oid)) x ON (true))
        WHERE (c.relkind = ANY (ARRAY['r'::"char", 't'::"char", 'm'::"char"]));
        """), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_tables</code> table
     * reference
     */
    public PgStatioAllTables(String alias) {
        this(DSL.name(alias), PG_STATIO_ALL_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_tables</code> table
     * reference
     */
    public PgStatioAllTables(Name alias) {
        this(alias, PG_STATIO_ALL_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_statio_all_tables</code> table reference
     */
    public PgStatioAllTables() {
        this(DSL.name("pg_statio_all_tables"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioAllTables as(String alias) {
        return new PgStatioAllTables(DSL.name(alias), this);
    }

    @Override
    public PgStatioAllTables as(Name alias) {
        return new PgStatioAllTables(alias, this);
    }

    @Override
    public PgStatioAllTables as(Table<?> alias) {
        return new PgStatioAllTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllTables rename(String name) {
        return new PgStatioAllTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllTables rename(Name name) {
        return new PgStatioAllTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllTables rename(Table<?> name) {
        return new PgStatioAllTables(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatioAllTables where(Condition condition) {
        return new PgStatioAllTables(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatioAllTables where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatioAllTables where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatioAllTables where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatioAllTables where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatioAllTables where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatioAllTables where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatioAllTables where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatioAllTables whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatioAllTables whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}