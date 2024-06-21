package com.manageway.config;

import com.manageway.domain.ApplicationContext;
import org.jooq.Condition;
import org.jooq.SelectQuery;
import org.jooq.VisitContext;
import org.jooq.VisitListener;
import org.jooq.impl.DSL;

import static com.manageway.domain.TenantId.TENANT_ID;

public class TenantIdVisitListener implements VisitListener {

    @Override
    public void clauseStart(VisitContext context) {
        ApplicationContext applicationContext = ApplicationContext.getInstance();
        if (!applicationContextIsValid(applicationContext))
            return;

        if (context.queryPart() instanceof SelectQuery<?> selectQuery) {
            Condition condition = DSL.field(TENANT_ID).eq(applicationContext.getTenantId().value());

            selectQuery.addConditions(condition);
        }
    }

    private boolean applicationContextIsValid(ApplicationContext applicationContext) {
        return applicationContext != null
                && applicationContext.getTenantId() != null
                && applicationContext.getTenantId().value() != null;
    }
}
