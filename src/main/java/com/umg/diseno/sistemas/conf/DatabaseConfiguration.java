package com.umg.diseno.sistemas.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import liquibase.integration.spring.SpringLiquibase;

@Configuration
@EnableTransactionManagement
public class DatabaseConfiguration {

    @Value("${liquibase.context}")
    private String liquibaseContext;
 
    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase sl = new SpringLiquibase();
        sl.setDataSource(dataSource);
        sl.setContexts(liquibaseContext);
        sl.setChangeLog("classpath:dbchangelog.xml");
        sl.setShouldRun(true);
        return sl;
    }
    
}
