package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import javax.sql.DataSource;



@Configuration
public class DataSourceConfig {
//    @Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
//        dataSource.setUsername("admin");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create()
        .url("jdbc:postgresql://localhost:5432/allbuy_user")
        .username("postgres")
        .password("admin")
        .driverClassName("org.postgresql.Driver")
        .build();
    }
//    @Bean
//    public DataSource dataSource(){
//        return DataSourceBuilder.create()
//                .url("jdbc:postgresql://localhost:5432/allbuy_user")
//                .username("postgres")
//                .password("admin")
//                .driverClassName("org.postgresql.Driver")
//                .build();
//    }


}
