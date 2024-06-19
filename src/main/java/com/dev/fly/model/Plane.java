package com.dev.fly.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "avions")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "name")
    private String name;

    public Long getId() {
        return id;
    }
}