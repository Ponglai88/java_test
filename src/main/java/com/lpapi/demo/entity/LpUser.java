package com.lpapi.demo.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lp_user")
public class LpUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "uesr_id")
    private String uesr_id;

    @Column(name = "amount")
    private String amount;

    @Column(name = "user_time")
    private Date user_time;

    // 构造函数、Getter 和 Setter 方法
}