/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.pg_catalog.tables;


import com.manageway.generated.jooq.pg_catalog.PgCatalog;
import com.manageway.generated.jooq.pg_catalog.tables.records.TsParseRecord;

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
public class TsParse extends TableImpl<TsParseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.ts_parse</code>
     */
    public static final TsParse TS_PARSE = new TsParse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TsParseRecord> getRecordType() {
        return TsParseRecord.class;
    }

    /**
     * The column <code>pg_catalog.ts_parse.tokid</code>.
     */
    public final TableField<TsParseRecord, Integer> TOKID = createField(DSL.name("tokid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.ts_parse.token</code>.
     */
    public final TableField<TsParseRecord, String> TOKEN = createField(DSL.name("token"), SQLDataType.CLOB, this, "");

    private TsParse(Name alias, Table<TsParseRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private TsParse(Name alias, Table<TsParseRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private TsParse(Name alias, Table<TsParseRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    public TsParse(String alias) {
        this(DSL.name(alias), TS_PARSE);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_parse</code> table reference
     */
    public TsParse(Name alias) {
        this(alias, TS_PARSE);
    }

    /**
     * Create a <code>pg_catalog.ts_parse</code> table reference
     */
    public TsParse() {
        this(DSL.name("ts_parse"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public TsParse as(String alias) {
        return new TsParse(DSL.name(alias), this, parameters);
    }

    @Override
    public TsParse as(Name alias) {
        return new TsParse(alias, this, parameters);
    }

    @Override
    public TsParse as(Table<?> alias) {
        return new TsParse(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsParse rename(String name) {
        return new TsParse(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsParse rename(Name name) {
        return new TsParse(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsParse rename(Table<?> name) {
        return new TsParse(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public TsParse call(
          String parserName
        , String txt
    ) {
        TsParse result = new TsParse(DSL.name("ts_parse"), null, new Field[] {
            DSL.val(parserName, SQLDataType.CLOB),
            DSL.val(txt, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public TsParse call(
          Field<String> parserName
        , Field<String> txt
    ) {
        TsParse result = new TsParse(DSL.name("ts_parse"), null, new Field[] {
            parserName,
            txt
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
