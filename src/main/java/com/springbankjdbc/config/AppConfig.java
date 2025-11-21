package com.springbankjdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.springbankjdbc")
public class AppConfig 
    {
	     @Bean
         public DataSource dataSource()
         {
        	 DriverManagerDataSource ds = new DriverManagerDataSource();
        	 ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        	 ds.setUrl("jdbc:mysql://127.0.0.1:3306/bank_spring_jdbc");
        	 ds.setUsername("root");
        	 ds.setPassword("Admin@123");
        	 
        	 return ds;
         }
	     
	     @Bean
	     public JdbcTemplate jdbctemplate(DataSource datasource)
	     {
	    	 
	    	 return new JdbcTemplate(datasource);
	     }
    }
