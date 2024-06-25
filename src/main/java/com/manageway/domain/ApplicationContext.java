package com.manageway.domain;

import java.util.UUID;

public class ApplicationContext {
    private TenantId tenantId;

    private static final ThreadLocal<ApplicationContext> threadLocal = new ThreadLocal<>();

    public ApplicationContext(TenantId tenantId) {
        this.tenantId = tenantId;
    }

    public static ApplicationContext getInstance() {
        if (threadLocal.get() == null)
            threadLocal.set(new ApplicationContext(null));
        return threadLocal.get();
    }

    public static void setInstance(ApplicationContext applicationContext) {
        if (getInstance() != null)
            clearInstance();
        threadLocal.set(applicationContext);
    }

    public static void clearInstance() {
        threadLocal.remove();
    }

    public TenantId getTenantId() {
        return tenantId;
    }

    public UUID getTenantIdValue() {
        return tenantId.value();
    }

    public void setTenantId(TenantId tenantId) {
        this.tenantId = tenantId;
    }
}
