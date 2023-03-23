package com.lpapi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.lpapi.demo.entity.LpUser;
import com.lpapi.demo.repository.LpUserRepository;

import java.util.List;

@RestController
public class ListController {
    @Autowired
    private LpUserRepository lpUserRepository;

    @GetMapping("/list")
    public List<LpUser> getList() {
        return lpUserRepository.findAll();
    }
    @GetMapping("/list/{id}")
    public List<LpUser> getUserById(@PathVariable Long id) {
        return (List<LpUser>) lpUserRepository.findByUserId(id);
    }
}
