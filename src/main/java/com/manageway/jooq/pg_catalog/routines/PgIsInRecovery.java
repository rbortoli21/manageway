/*
 * This file is generated by jOOQ.
 */
package com.manageway.jooq.pg_catalog.routines;


import com.manageway.jooq.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgIsInRecovery extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_is_in_recovery.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public PgIsInRecovery() {
        super("pg_is_in_recovery", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
    }
}