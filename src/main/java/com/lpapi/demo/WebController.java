package com.lpapi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class WebController {
    @Autowired
    private DataSource dataSource;
    @RequestMapping("/")
    public String hello(){
        return "Hello javaTpoint";
    }
    @RequestMapping("/test")
    public String test() {
        return "This is a test page";
    }
    @GetMapping("/error")
    public String handleError() {
        // Handle error
        return "error";
    }
}
