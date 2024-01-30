package com.tolga.pinsoftproject1;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


@SpringBootApplication
public class PinsoftProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(PinsoftProject1Application.class, args);
    }


//@Bean
//public SpringLiquibase liquibase(DataSource dataSource) {
//    SpringLiquibase liquibase = new SpringLiquibase();
//    liquibase.setChangeLog("classpath:config/liquibase/changelog/master.xml");
//    liquibase.setDataSource(dataSource);
//    return liquibase;
//}
//




}
