package com.lpapi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.lpapi.demo.entity.LpUser;
import com.lpapi.demo.repository.LpUserRepository;

@RestController
@RequestMapping("/list")
public class ListController {
    @Autowired
    private LpUserRepository lpUserRepository;
    @GetMapping
    public String getListPage() {
        // 处理程序代码
        return "list";  // 返回视图名称
    }
    @GetMapping("/{id}")
    public LpUser getUserById(@PathVariable Long id) {
        return lpUserRepository.findByUserId(id);
    }
}
