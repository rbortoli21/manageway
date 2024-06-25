/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.pg_catalog.tables;


import com.manageway.generated.jooq.pg_catalog.PgCatalog;
import com.manageway.generated.jooq.pg_catalog.tables.records.PgLsDirRecord;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
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
public class PgLsDir extends TableImpl<PgLsDirRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_dir</code>
     */
    public static final PgLsDir PG_LS_DIR = new PgLsDir();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLsDirRecord> getRecordType() {
        return PgLsDirRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_dir.pg_ls_dir</code>.
     */
    public final TableField<PgLsDirRecord, String> PG_LS_DIR_ = createField(DSL.name("pg_ls_dir"), SQLDataType.CLOB, this, "");

    private PgLsDir(Name alias, Table<PgLsDirRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private PgLsDir(Name alias, Table<PgLsDirRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private PgLsDir(Name alias, Table<PgLsDirRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir(String alias) {
        this(DSL.name(alias), PG_LS_DIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir(Name alias) {
        this(alias, PG_LS_DIR);
    }

    /**
     * Create a <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir() {
        this(DSL.name("pg_ls_dir"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLsDir as(String alias) {
        return new PgLsDir(DSL.name(alias), this, parameters);
    }

    @Override
    public PgLsDir as(Name alias) {
        return new PgLsDir(alias, this, parameters);
    }

    @Override
    public PgLsDir as(Table<?> alias) {
        return new PgLsDir(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsDir rename(String name) {
        return new PgLsDir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsDir rename(Name name) {
        return new PgLsDir(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsDir rename(Table<?> name) {
        return new PgLsDir(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgLsDir call(
          String __1
    ) {
        PgLsDir result = new PgLsDir(DSL.name("pg_ls_dir"), null, new Field[] {
            DSL.val(__1, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLsDir call(
          Field<String> __1
    ) {
        PgLsDir result = new PgLsDir(DSL.name("pg_ls_dir"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
