/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables;


import com.manageway.jooq.pg_catalog.Indexes;
import com.manageway.jooq.pg_catalog.Keys;
import com.manageway.jooq.pg_catalog.PgCatalog;
import com.manageway.jooq.pg_catalog.tables.records.PgAuthMembersRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgAuthMembers extends TableImpl<PgAuthMembersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_auth_members</code>
     */
    public static final PgAuthMembers PG_AUTH_MEMBERS = new PgAuthMembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAuthMembersRecord> getRecordType() {
        return PgAuthMembersRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_auth_members.oid</code>.
     */
    public final TableField<PgAuthMembersRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    public final TableField<PgAuthMembersRecord, Long> ROLEID = createField(DSL.name("roleid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.member</code>.
     */
    public final TableField<PgAuthMembersRecord, Long> MEMBER = createField(DSL.name("member"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    public final TableField<PgAuthMembersRecord, Long> GRANTOR = createField(DSL.name("grantor"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    public final TableField<PgAuthMembersRecord, Boolean> ADMIN_OPTION = createField(DSL.name("admin_option"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.inherit_option</code>.
     */
    public final TableField<PgAuthMembersRecord, Boolean> INHERIT_OPTION = createField(DSL.name("inherit_option"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.set_option</code>.
     */
    public final TableField<PgAuthMembersRecord, Boolean> SET_OPTION = createField(DSL.name("set_option"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgAuthMembers(Name alias, Table<PgAuthMembersRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgAuthMembers(Name alias, Table<PgAuthMembersRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_auth_members</code> table reference
     */
    public PgAuthMembers(String alias) {
        this(DSL.name(alias), PG_AUTH_MEMBERS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_auth_members</code> table reference
     */
    public PgAuthMembers(Name alias) {
        this(alias, PG_AUTH_MEMBERS);
    }

    /**
     * Create a <code>pg_catalog.pg_auth_members</code> table reference
     */
    public PgAuthMembers() {
        this(DSL.name("pg_auth_members"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_AUTH_MEMBERS_GRANTOR_INDEX);
    }

    @Override
    public UniqueKey<PgAuthMembersRecord> getPrimaryKey() {
        return Keys.PG_AUTH_MEMBERS_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgAuthMembersRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_AUTH_MEMBERS_MEMBER_ROLE_INDEX, Keys.PG_AUTH_MEMBERS_ROLE_MEMBER_INDEX);
    }

    @Override
    public PgAuthMembers as(String alias) {
        return new PgAuthMembers(DSL.name(alias), this);
    }

    @Override
    public PgAuthMembers as(Name alias) {
        return new PgAuthMembers(alias, this);
    }

    @Override
    public PgAuthMembers as(Table<?> alias) {
        return new PgAuthMembers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthMembers rename(String name) {
        return new PgAuthMembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthMembers rename(Name name) {
        return new PgAuthMembers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthMembers rename(Table<?> name) {
        return new PgAuthMembers(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAuthMembers where(Condition condition) {
        return new PgAuthMembers(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAuthMembers where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAuthMembers where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAuthMembers where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAuthMembers where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAuthMembers where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAuthMembers where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgAuthMembers where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAuthMembers whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgAuthMembers whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}