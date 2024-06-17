/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables;


import com.manageway.jooq.pg_catalog.Indexes;
import com.manageway.jooq.pg_catalog.Keys;
import com.manageway.jooq.pg_catalog.PgCatalog;
import com.manageway.jooq.pg_catalog.tables.records.PgClassRecord;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Index;
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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgClass extends TableImpl<PgClassRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_class</code>
     */
    public static final PgClass PG_CLASS = new PgClass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgClassRecord> getRecordType() {
        return PgClassRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_class.oid</code>.
     */
    public final TableField<PgClassRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relname</code>.
     */
    public final TableField<PgClassRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relnamespace</code>.
     */
    public final TableField<PgClassRecord, Long> RELNAMESPACE = createField(DSL.name("relnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltype</code>.
     */
    public final TableField<PgClassRecord, Long> RELTYPE = createField(DSL.name("reltype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reloftype</code>.
     */
    public final TableField<PgClassRecord, Long> RELOFTYPE = createField(DSL.name("reloftype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relowner</code>.
     */
    public final TableField<PgClassRecord, Long> RELOWNER = createField(DSL.name("relowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relam</code>.
     */
    public final TableField<PgClassRecord, Long> RELAM = createField(DSL.name("relam"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relfilenode</code>.
     */
    public final TableField<PgClassRecord, Long> RELFILENODE = createField(DSL.name("relfilenode"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltablespace</code>.
     */
    public final TableField<PgClassRecord, Long> RELTABLESPACE = createField(DSL.name("reltablespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relpages</code>.
     */
    public final TableField<PgClassRecord, Integer> RELPAGES = createField(DSL.name("relpages"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltuples</code>.
     */
    public final TableField<PgClassRecord, Float> RELTUPLES = createField(DSL.name("reltuples"), SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relallvisible</code>.
     */
    public final TableField<PgClassRecord, Integer> RELALLVISIBLE = createField(DSL.name("relallvisible"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltoastrelid</code>.
     */
    public final TableField<PgClassRecord, Long> RELTOASTRELID = createField(DSL.name("reltoastrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhasindex</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASINDEX = createField(DSL.name("relhasindex"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relisshared</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELISSHARED = createField(DSL.name("relisshared"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relpersistence</code>.
     */
    public final TableField<PgClassRecord, String> RELPERSISTENCE = createField(DSL.name("relpersistence"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relkind</code>.
     */
    public final TableField<PgClassRecord, String> RELKIND = createField(DSL.name("relkind"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relnatts</code>.
     */
    public final TableField<PgClassRecord, Short> RELNATTS = createField(DSL.name("relnatts"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relchecks</code>.
     */
    public final TableField<PgClassRecord, Short> RELCHECKS = createField(DSL.name("relchecks"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhasrules</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASRULES = createField(DSL.name("relhasrules"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhastriggers</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASTRIGGERS = createField(DSL.name("relhastriggers"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhassubclass</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELHASSUBCLASS = createField(DSL.name("relhassubclass"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relrowsecurity</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELROWSECURITY = createField(DSL.name("relrowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relforcerowsecurity</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELFORCEROWSECURITY = createField(DSL.name("relforcerowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relispopulated</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELISPOPULATED = createField(DSL.name("relispopulated"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relreplident</code>.
     */
    public final TableField<PgClassRecord, String> RELREPLIDENT = createField(DSL.name("relreplident"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relispartition</code>.
     */
    public final TableField<PgClassRecord, Boolean> RELISPARTITION = createField(DSL.name("relispartition"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relrewrite</code>.
     */
    public final TableField<PgClassRecord, Long> RELREWRITE = createField(DSL.name("relrewrite"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relfrozenxid</code>.
     */
    public final TableField<PgClassRecord, Long> RELFROZENXID = createField(DSL.name("relfrozenxid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relminmxid</code>.
     */
    public final TableField<PgClassRecord, Long> RELMINMXID = createField(DSL.name("relminmxid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relacl</code>.
     */
    public final TableField<PgClassRecord, String[]> RELACL = createField(DSL.name("relacl"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reloptions</code>.
     */
    public final TableField<PgClassRecord, String[]> RELOPTIONS = createField(DSL.name("reloptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgClassRecord, Object> RELPARTBOUND = createField(DSL.name("relpartbound"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgClass(Name alias, Table<PgClassRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgClass(Name alias, Table<PgClassRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass(String alias) {
        this(DSL.name(alias), PG_CLASS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass(Name alias) {
        this(alias, PG_CLASS);
    }

    /**
     * Create a <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass() {
        this(DSL.name("pg_class"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_CLASS_TBLSPC_RELFILENODE_INDEX);
    }

    @Override
    public UniqueKey<PgClassRecord> getPrimaryKey() {
        return Keys.PG_CLASS_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgClassRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_CLASS_RELNAME_NSP_INDEX);
    }

    @Override
    public PgClass as(String alias) {
        return new PgClass(DSL.name(alias), this);
    }

    @Override
    public PgClass as(Name alias) {
        return new PgClass(alias, this);
    }

    @Override
    public PgClass as(Table<?> alias) {
        return new PgClass(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgClass rename(String name) {
        return new PgClass(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgClass rename(Name name) {
        return new PgClass(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgClass rename(Table<?> name) {
        return new PgClass(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgClass where(Condition condition) {
        return new PgClass(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgClass where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgClass where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgClass where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgClass where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgClass where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgClass where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgClass where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgClass whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgClass whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}