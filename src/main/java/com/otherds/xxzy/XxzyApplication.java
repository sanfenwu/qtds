package com.otherds.xxzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class XxzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxzyApplication.class, args);
    }

}
