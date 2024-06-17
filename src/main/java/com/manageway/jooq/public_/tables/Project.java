/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.public_.tables;


import com.manageway.jooq.public_.Keys;
import com.manageway.jooq.public_.Public;
import com.manageway.jooq.public_.tables.Customer.CustomerPath;
import com.manageway.jooq.public_.tables.Employee.EmployeePath;
import com.manageway.jooq.public_.tables.EmployeeProjects.EmployeeProjectsPath;
import com.manageway.jooq.public_.tables.records.ProjectRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Project extends TableImpl<ProjectRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.project</code>
     */
    public static final Project PROJECT = new Project();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectRecord> getRecordType() {
        return ProjectRecord.class;
    }

    /**
     * The column <code>public.project.id</code>.
     */
    public final TableField<ProjectRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.project.created_at</code>.
     */
    public final TableField<ProjectRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.project.tenant_id</code>.
     */
    public final TableField<ProjectRecord, UUID> TENANT_ID = createField(DSL.name("tenant_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.project.updated_at</code>.
     */
    public final TableField<ProjectRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.project.end_date</code>.
     */
    public final TableField<ProjectRecord, LocalDateTime> END_DATE = createField(DSL.name("end_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.project.start_date</code>.
     */
    public final TableField<ProjectRecord, LocalDateTime> START_DATE = createField(DSL.name("start_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.project.title</code>.
     */
    public final TableField<ProjectRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.project.total_price</code>.
     */
    public final TableField<ProjectRecord, Double> TOTAL_PRICE = createField(DSL.name("total_price"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.project.customer_id</code>.
     */
    public final TableField<ProjectRecord, UUID> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.project.employee_id</code>.
     */
    public final TableField<ProjectRecord, UUID> EMPLOYEE_ID = createField(DSL.name("employee_id"), SQLDataType.UUID, this, "");

    private Project(Name alias, Table<ProjectRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Project(Name alias, Table<ProjectRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.project</code> table reference
     */
    public Project(String alias) {
        this(DSL.name(alias), PROJECT);
    }

    /**
     * Create an aliased <code>public.project</code> table reference
     */
    public Project(Name alias) {
        this(alias, PROJECT);
    }

    /**
     * Create a <code>public.project</code> table reference
     */
    public Project() {
        this(DSL.name("project"), null);
    }

    public <O extends Record> Project(Table<O> path, ForeignKey<O, ProjectRecord> childPath, InverseForeignKey<O, ProjectRecord> parentPath) {
        super(path, childPath, parentPath, PROJECT);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ProjectPath extends Project implements Path<ProjectRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ProjectPath(Table<O> path, ForeignKey<O, ProjectRecord> childPath, InverseForeignKey<O, ProjectRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ProjectPath(Name alias, Table<ProjectRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ProjectPath as(String alias) {
            return new ProjectPath(DSL.name(alias), this);
        }

        @Override
        public ProjectPath as(Name alias) {
            return new ProjectPath(alias, this);
        }

        @Override
        public ProjectPath as(Table<?> alias) {
            return new ProjectPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<ProjectRecord> getPrimaryKey() {
        return Keys.PROJECT_PKEY;
    }

    @Override
    public List<UniqueKey<ProjectRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UKL035V0OX5H9CT820A40ELSJA, Keys.UKPO57PJX1GK21PJYVPE6WWOAC3);
    }

    @Override
    public List<ForeignKey<ProjectRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PROJECT__FKJ948TRU2ILGQXFXSPPP9MOM5J, Keys.PROJECT__FKOX7XSYL6K8FC7AQ1MPE8507HF);
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, Keys.PROJECT__FKJ948TRU2ILGQXFXSPPP9MOM5J, null);

        return _customer;
    }

    private transient EmployeePath _employee;

    /**
     * Get the implicit join path to the <code>public.employee</code> table.
     */
    public EmployeePath employee() {
        if (_employee == null)
            _employee = new EmployeePath(this, Keys.PROJECT__FKOX7XSYL6K8FC7AQ1MPE8507HF, null);

        return _employee;
    }

    private transient EmployeeProjectsPath _employeeProjects;

    /**
     * Get the implicit to-many join path to the
     * <code>public.employee_projects</code> table
     */
    public EmployeeProjectsPath employeeProjects() {
        if (_employeeProjects == null)
            _employeeProjects = new EmployeeProjectsPath(this, null, Keys.EMPLOYEE_PROJECTS__FKIN7837PBK9GD6VAQYSD1SI8D4.getInverseKey());

        return _employeeProjects;
    }

    @Override
    public Project as(String alias) {
        return new Project(DSL.name(alias), this);
    }

    @Override
    public Project as(Name alias) {
        return new Project(alias, this);
    }

    @Override
    public Project as(Table<?> alias) {
        return new Project(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Project rename(String name) {
        return new Project(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Project rename(Name name) {
        return new Project(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Project rename(Table<?> name) {
        return new Project(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Project where(Condition condition) {
        return new Project(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Project where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Project where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Project where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Project where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Project where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Project where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Project where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Project whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Project whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}