package com.example.backend.entities;

import com.example.backend.enums.type;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class booking {

    @Id
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private float duration;

    @Column(nullable = false)
    private type type;
}
