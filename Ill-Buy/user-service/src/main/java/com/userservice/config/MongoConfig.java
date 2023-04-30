//package com.example.demo.config;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//@Configuration
//@EnableMongoRepositories(basePackages = "com.example.demo.repository")
//public class MongoConfig extends AbstractMongoClientConfiguration {
//
//    @Value("${spring.data.mongodb.host}")
//    private String host;
//    @Value("${spring.data.mongodb.port}")
//    private int port;
//    @Value("${spring.data.mongodb.database}")
//    private String database;
//    @Override
//    protected String getDatabaseName() {
//        return database;
//    }
//
////    "mongodb://localhost:27017/mydatabase"
//    @Override
//    public MongoClient mongoClient() {
//        return MongoClients.create(String.format("mongodb://%s:%d", host, port));
//    }
////    @Bean
////    public MongoClient mongoClient() {
////        return MongoClients.create("mongodb://localhost:27017/mydatabase");
////    }
////    @Bean
////    public MongoTemplate mongoTemplate() throws Exception {
////        return new MongoTemplate(mongoClient(), database);
////    }
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoClient(), "mydatabase");
//}
//}
