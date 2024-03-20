package com.example.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    @Column(nullable = false, length = 128, unique = true)
    int ID;

    @Column(nullable = false, length = 128)
    String name;

    @Column(nullable = false, length = 128, unique = true)
    int total;

}
