package com.manageway.config;

import com.manageway.web.filter.TenantIdVisitListener;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultVisitListenerProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class JooqConfiguration {

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
