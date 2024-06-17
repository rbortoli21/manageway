/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.tables.records;


import com.manageway.jooq.pg_catalog.tables.PgEventTriggerDdlCommands;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgEventTriggerDdlCommandsRecord extends TableRecordImpl<PgEventTriggerDdlCommandsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_event_trigger_ddl_commands.classid</code>.
     */
    public void setClassid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger_ddl_commands.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger_ddl_commands.objid</code>.
     */
    public void setObjid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger_ddl_commands.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.command_tag</code>.
     */
    public void setCommandTag(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.command_tag</code>.
     */
    public String getCommandTag() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_type</code>.
     */
    public void setObjectType(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_type</code>.
     */
    public String getObjectType() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.schema_name</code>.
     */
    public void setSchemaName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_identity</code>.
     */
    public void setObjectIdentity(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_identity</code>.
     */
    public String getObjectIdentity() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.in_extension</code>.
     */
    public void setInExtension(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.in_extension</code>.
     */
    public Boolean getInExtension() {
        return (Boolean) get(7);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setCommand(Object value) {
        set(8, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getCommand() {
        return get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgEventTriggerDdlCommandsRecord
     */
    public PgEventTriggerDdlCommandsRecord() {
        super(PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS);
    }

    /**
     * Create a detached, initialised PgEventTriggerDdlCommandsRecord
     */
    public PgEventTriggerDdlCommandsRecord(Long classid, Long objid, Integer objsubid, String commandTag, String objectType, String schemaName, String objectIdentity, Boolean inExtension, Object command) {
        super(PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS);

        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setCommandTag(commandTag);
        setObjectType(objectType);
        setSchemaName(schemaName);
        setObjectIdentity(objectIdentity);
        setInExtension(inExtension);
        setCommand(command);
        resetChangedOnNotNull();
    }
}