package com.lpapi.demo.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lp_user")
public class LpUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    @Column(name = "amount")
    private String amount;

    @Column(name = "time")
    private Date time;


    // Getters and setters
}