package com.manageway.config;

import com.manageway.domain.ApplicationContext;
import org.jooq.*;
import org.jooq.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

import static com.manageway.domain.TenantId.TENANT_ID;


@Configuration
public class JooqConfiguration{

    private final DataSource dataSource;

    public JooqConfiguration(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public DSLContext dslContext() {
        DefaultConfiguration configuration = new DefaultConfiguration();
        configuration.setSQLDialect(SQLDialect.POSTGRES);
        configuration.setDataSource(dataSource);
        configuration.set(new DefaultVisitListenerProvider(new TenantIdVisitListener()));

        return DSL.using(configuration);
        //return new DefaultDSLContext(dataSource, SQLDialect.POSTGRES);
    }
}
