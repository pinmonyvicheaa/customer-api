package com.example.customerapi.entity;


import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;


}
