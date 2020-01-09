package com.example.demo;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import oracle.jdbc.pool.OracleDataSource;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
//	@Bean
//    DataSource dataSource() throws SQLException {
//        OracleDataSource dataSource = new OracleDataSource();
//        dataSource.setUser("sys as sysdba");
//        dataSource.setPassword("1qaz2wsx");
//        dataSource.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
//        dataSource.setImplicitCachingEnabled(true);
//        dataSource.setFastConnectionFailoverEnabled(true);
//        return dataSource;
//	}
	@Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:oracle:thin:@localhost:1521:orcl");
        dataSourceBuilder.username("sys as sysdba");
        dataSourceBuilder.password("1qaz2wsx");
        return dataSourceBuilder.build();
    }
}
