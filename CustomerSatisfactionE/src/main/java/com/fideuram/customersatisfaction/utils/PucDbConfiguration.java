package com.fideuram.customersatisfaction.utils;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PucDbConfiguration {
	@Bean(name = "pucDatasource")
    @ConfigurationProperties(prefix = "spring.puc-datasource")
    public DataSource pucDatasource() {
        return DataSourceBuilder.create().build();
    }

    
    @Bean(name = "pucEntityManager")
    public LocalContainerEntityManagerFactoryBean pucEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(pucDatasource()).persistenceUnit("pucPU")
                .packages("com.fideuram.inviomailclientidocumentiarchiviati.model").build();
    }

}
