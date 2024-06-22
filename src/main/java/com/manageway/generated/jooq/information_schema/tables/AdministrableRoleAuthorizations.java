/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.information_schema.tables;


import com.manageway.generated.jooq.information_schema.Domains;
import com.manageway.generated.jooq.information_schema.InformationSchema;
import com.manageway.generated.jooq.information_schema.tables.records.AdministrableRoleAuthorizationsRecord;

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
public class AdministrableRoleAuthorizations extends TableImpl<AdministrableRoleAuthorizationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.administrable_role_authorizations</code>
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = new AdministrableRoleAuthorizations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdministrableRoleAuthorizationsRecord> getRecordType() {
        return AdministrableRoleAuthorizationsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE = createField(DSL.name("grantee"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_NAME = createField(DSL.name("role_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), Domains.YES_OR_NO.getDataType(), this, "");

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "administrable_role_authorizations" as  SELECT grantee,
          role_name,
          is_grantable
         FROM information_schema.applicable_roles
        WHERE ((is_grantable)::text = 'YES'::text);
        """), where);
    }

    /**
     * Create an aliased
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    public AdministrableRoleAuthorizations(String alias) {
        this(DSL.name(alias), ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create an aliased
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    public AdministrableRoleAuthorizations(Name alias) {
        this(alias, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create a
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    public AdministrableRoleAuthorizations() {
        this(DSL.name("administrable_role_authorizations"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public AdministrableRoleAuthorizations as(String alias) {
        return new AdministrableRoleAuthorizations(DSL.name(alias), this);
    }

    @Override
    public AdministrableRoleAuthorizations as(Name alias) {
        return new AdministrableRoleAuthorizations(alias, this);
    }

    @Override
    public AdministrableRoleAuthorizations as(Table<?> alias) {
        return new AdministrableRoleAuthorizations(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(String name) {
        return new AdministrableRoleAuthorizations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(Name name) {
        return new AdministrableRoleAuthorizations(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(Table<?> name) {
        return new AdministrableRoleAuthorizations(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public AdministrableRoleAuthorizations where(Condition condition) {
        return new AdministrableRoleAuthorizations(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public AdministrableRoleAuthorizations where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public AdministrableRoleAuthorizations where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public AdministrableRoleAuthorizations where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public AdministrableRoleAuthorizations where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public AdministrableRoleAuthorizations where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public AdministrableRoleAuthorizations where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public AdministrableRoleAuthorizations where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public AdministrableRoleAuthorizations whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public AdministrableRoleAuthorizations whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}