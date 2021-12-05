package com.example.multipledbspringboot.controller;

import com.example.multipledbspringboot.jdbctemplateconfig.JdbcTemplateConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class MultipleDbController {

    private  JdbcTemplate jdbcTemplate1 = new JdbcTemplate(JdbcTemplateConfig.dataSource1());

    private  JdbcTemplate jdbcTemplate2 = new JdbcTemplate(JdbcTemplateConfig.dataSource2());


    @GetMapping("/test")
    public ResponseEntity<String> insertData() {

        int id =  new Random().nextInt(1000);
        System.out.println("Id is : " + id);
        jdbcTemplate1.execute("insert into public.user (id, username) values (" + id + ",  '" + id + "_aaa')");

        jdbcTemplate2.execute("insert into public.user (id, username) values ("+ (id + 1) + ", '" + (id + 1) +"_aaa')");
        System.out.println("Inserted records successfully to both Db.");

        return ResponseEntity.ok("Success");
    }

}
