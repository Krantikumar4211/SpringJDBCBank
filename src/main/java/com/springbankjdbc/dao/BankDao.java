package com.springbankjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {

    @Autowired
    private JdbcTemplate jdbcTemplate; 

    public void insertBank(String name, String branch, String city, String ifsc) {
        String sql = "INSERT INTO bank_info(name, branch, city, ifsc) VALUES(?, ?, ?, ?)";
        jdbcTemplate.update(sql, name, branch, city, ifsc);
        System.out.println("Record inserted successfully!");
    } 

  
}
