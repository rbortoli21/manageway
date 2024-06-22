/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.information_schema.tables;


import com.manageway.generated.jooq.information_schema.Domains;
import com.manageway.generated.jooq.information_schema.InformationSchema;
import com.manageway.generated.jooq.information_schema.tables.records.ColumnPrivilegesRecord;

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
public class ColumnPrivileges extends TableImpl<ColumnPrivilegesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.column_privileges</code>
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = new ColumnPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnPrivilegesRecord> getRecordType() {
        return ColumnPrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.column_privileges.grantor</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> GRANTOR = createField(DSL.name("grantor"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_privileges.grantee</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> GRANTEE = createField(DSL.name("grantee"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_privileges.table_catalog</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_privileges.table_schema</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_privileges.table_name</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_NAME = createField(DSL.name("table_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_privileges.column_name</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_privileges.privilege_type</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_privileges.is_grantable</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), Domains.YES_OR_NO.getDataType(), this, "");

    private ColumnPrivileges(Name alias, Table<ColumnPrivilegesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ColumnPrivileges(Name alias, Table<ColumnPrivilegesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "column_privileges" as  SELECT (u_grantor.rolname)::information_schema.sql_identifier AS grantor,
          (grantee.rolname)::information_schema.sql_identifier AS grantee,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (x.relname)::information_schema.sql_identifier AS table_name,
          (x.attname)::information_schema.sql_identifier AS column_name,
          (x.prtype)::information_schema.character_data AS privilege_type,
          (
              CASE
                  WHEN (pg_has_role(x.grantee, x.relowner, 'USAGE'::text) OR x.grantable) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_grantable
         FROM ( SELECT pr_c.grantor,
                  pr_c.grantee,
                  a.attname,
                  pr_c.relname,
                  pr_c.relnamespace,
                  pr_c.prtype,
                  pr_c.grantable,
                  pr_c.relowner
                 FROM ( SELECT pg_class.oid,
                          pg_class.relname,
                          pg_class.relnamespace,
                          pg_class.relowner,
                          (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantor AS grantor,
                          (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantee AS grantee,
                          (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).privilege_type AS privilege_type,
                          (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).is_grantable AS is_grantable
                         FROM pg_class
                        WHERE (pg_class.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"]))) pr_c(oid, relname, relnamespace, relowner, grantor, grantee, prtype, grantable),
                  pg_attribute a
                WHERE ((a.attrelid = pr_c.oid) AND (a.attnum > 0) AND (NOT a.attisdropped))
              UNION
               SELECT pr_a.grantor,
                  pr_a.grantee,
                  pr_a.attname,
                  c.relname,
                  c.relnamespace,
                  pr_a.prtype,
                  pr_a.grantable,
                  c.relowner
                 FROM ( SELECT a.attrelid,
                          a.attname,
                          (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).grantor AS grantor,
                          (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).grantee AS grantee,
                          (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).privilege_type AS privilege_type,
                          (aclexplode(COALESCE(a.attacl, acldefault('c'::"char", cc.relowner)))).is_grantable AS is_grantable
                         FROM (pg_attribute a
                           JOIN pg_class cc ON ((a.attrelid = cc.oid)))
                        WHERE ((a.attnum > 0) AND (NOT a.attisdropped))) pr_a(attrelid, attname, grantor, grantee, prtype, grantable),
                  pg_class c
                WHERE ((pr_a.attrelid = c.oid) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])))) x,
          pg_namespace nc,
          pg_authid u_grantor,
          ( SELECT pg_authid.oid,
                  pg_authid.rolname
                 FROM pg_authid
              UNION ALL
               SELECT (0)::oid AS oid,
                  'PUBLIC'::name) grantee(oid, rolname)
        WHERE ((x.relnamespace = nc.oid) AND (x.grantee = grantee.oid) AND (x.grantor = u_grantor.oid) AND (x.prtype = ANY (ARRAY['INSERT'::text, 'SELECT'::text, 'UPDATE'::text, 'REFERENCES'::text])) AND (pg_has_role(u_grantor.oid, 'USAGE'::text) OR pg_has_role(grantee.oid, 'USAGE'::text) OR (grantee.rolname = 'PUBLIC'::name)));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema.column_privileges</code> table
     * reference
     */
    public ColumnPrivileges(String alias) {
        this(DSL.name(alias), COLUMN_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.column_privileges</code> table
     * reference
     */
    public ColumnPrivileges(Name alias) {
        this(alias, COLUMN_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.column_privileges</code> table
     * reference
     */
    public ColumnPrivileges() {
        this(DSL.name("column_privileges"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnPrivileges as(String alias) {
        return new ColumnPrivileges(DSL.name(alias), this);
    }

    @Override
    public ColumnPrivileges as(Name alias) {
        return new ColumnPrivileges(alias, this);
    }

    @Override
    public ColumnPrivileges as(Table<?> alias) {
        return new ColumnPrivileges(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnPrivileges rename(String name) {
        return new ColumnPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnPrivileges rename(Name name) {
        return new ColumnPrivileges(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnPrivileges rename(Table<?> name) {
        return new ColumnPrivileges(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnPrivileges where(Condition condition) {
        return new ColumnPrivileges(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnPrivileges where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnPrivileges where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnPrivileges where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnPrivileges where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnPrivileges where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnPrivileges where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnPrivileges where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnPrivileges whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnPrivileges whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}