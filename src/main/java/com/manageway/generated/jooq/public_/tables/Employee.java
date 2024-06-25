/*
 * This file is generated by jOOQ.
 */
package com.manageway.generated.jooq.public_.tables;


import com.manageway.generated.jooq.public_.Indexes;
import com.manageway.generated.jooq.public_.Keys;
import com.manageway.generated.jooq.public_.Public;
import com.manageway.generated.jooq.public_.tables.EmployeeCustomers.EmployeeCustomersPath;
import com.manageway.generated.jooq.public_.tables.EmployeeProjects.EmployeeProjectsPath;
import com.manageway.generated.jooq.public_.tables.Project.ProjectPath;
import com.manageway.generated.jooq.public_.tables.Users.UsersPath;
import com.manageway.generated.jooq.public_.tables.records.EmployeeRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
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
public class Employee extends TableImpl<EmployeeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.employee</code>
     */
    public static final Employee EMPLOYEE = new Employee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeRecord> getRecordType() {
        return EmployeeRecord.class;
    }

    /**
     * The column <code>public.employee.id</code>.
     */
    public final TableField<EmployeeRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.employee.user_id</code>.
     */
    public final TableField<EmployeeRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.employee.balance</code>.
     */
    public final TableField<EmployeeRecord, BigDecimal> BALANCE = createField(DSL.name("balance"), SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>public.employee.created_at</code>.
     */
    public final TableField<EmployeeRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.employee.updated_at</code>.
     */
    public final TableField<EmployeeRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.employee.tenant_id</code>.
     */
    public final TableField<EmployeeRecord, UUID> TENANT_ID = createField(DSL.name("tenant_id"), SQLDataType.UUID, this, "");

    private Employee(Name alias, Table<EmployeeRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Employee(Name alias, Table<EmployeeRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.employee</code> table reference
     */
    public Employee(String alias) {
        this(DSL.name(alias), EMPLOYEE);
    }

    /**
     * Create an aliased <code>public.employee</code> table reference
     */
    public Employee(Name alias) {
        this(alias, EMPLOYEE);
    }

    /**
     * Create a <code>public.employee</code> table reference
     */
    public Employee() {
        this(DSL.name("employee"), null);
    }

    public <O extends Record> Employee(Table<O> path, ForeignKey<O, EmployeeRecord> childPath, InverseForeignKey<O, EmployeeRecord> parentPath) {
        super(path, childPath, parentPath, EMPLOYEE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class EmployeePath extends Employee implements Path<EmployeeRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> EmployeePath(Table<O> path, ForeignKey<O, EmployeeRecord> childPath, InverseForeignKey<O, EmployeeRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private EmployeePath(Name alias, Table<EmployeeRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public EmployeePath as(String alias) {
            return new EmployeePath(DSL.name(alias), this);
        }

        @Override
        public EmployeePath as(Name alias) {
            return new EmployeePath(alias, this);
        }

        @Override
        public EmployeePath as(Table<?> alias) {
            return new EmployeePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_EMPLOYEE_TENANT_ID);
    }

    @Override
    public UniqueKey<EmployeeRecord> getPrimaryKey() {
        return Keys.EMPLOYEE_PKEY;
    }

    @Override
    public List<ForeignKey<EmployeeRecord, ?>> getReferences() {
        return Arrays.asList(Keys.EMPLOYEE__FK_EMPLOYEE_USER);
    }

    private transient UsersPath _users;

    /**
     * Get the implicit join path to the <code>public.users</code> table.
     */
    public UsersPath users() {
        if (_users == null)
            _users = new UsersPath(this, Keys.EMPLOYEE__FK_EMPLOYEE_USER, null);

        return _users;
    }

    private transient EmployeeCustomersPath _employeeCustomers;

    /**
     * Get the implicit to-many join path to the
     * <code>public.employee_customers</code> table
     */
    public EmployeeCustomersPath employeeCustomers() {
        if (_employeeCustomers == null)
            _employeeCustomers = new EmployeeCustomersPath(this, null, Keys.EMPLOYEE_CUSTOMERS__FK_EMPLOYEE_CUSTOMERS_EMPLOYEE.getInverseKey());

        return _employeeCustomers;
    }

    private transient EmployeeProjectsPath _employeeProjects;

    /**
     * Get the implicit to-many join path to the
     * <code>public.employee_projects</code> table
     */
    public EmployeeProjectsPath employeeProjects() {
        if (_employeeProjects == null)
            _employeeProjects = new EmployeeProjectsPath(this, null, Keys.EMPLOYEE_PROJECTS__FK_EMPLOYEE_PROJECTS_EMPLOYEE.getInverseKey());

        return _employeeProjects;
    }

    private transient ProjectPath _project;

    /**
     * Get the implicit to-many join path to the <code>public.project</code>
     * table
     */
    public ProjectPath project() {
        if (_project == null)
            _project = new ProjectPath(this, null, Keys.PROJECT__FK_PROJECT_EMPLOYEE.getInverseKey());

        return _project;
    }

    @Override
    public Employee as(String alias) {
        return new Employee(DSL.name(alias), this);
    }

    @Override
    public Employee as(Name alias) {
        return new Employee(alias, this);
    }

    @Override
    public Employee as(Table<?> alias) {
        return new Employee(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(String name) {
        return new Employee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(Name name) {
        return new Employee(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(Table<?> name) {
        return new Employee(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Employee where(Condition condition) {
        return new Employee(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Employee where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Employee where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Employee where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Employee where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Employee where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Employee where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Employee where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Employee whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Employee whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
