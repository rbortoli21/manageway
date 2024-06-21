package com.manageway.domain;

public class ApplicationContext {
    private TenantId tenantId;

    private static final ThreadLocal<ApplicationContext> threadLocal = new ThreadLocal<>();

    public ApplicationContext(TenantId tenantId) {
        this.tenantId = tenantId;
    }

    public static ApplicationContext getInstance() {
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

    public void setTenantId(TenantId tenantId) {
        this.tenantId = tenantId;
    }
}
