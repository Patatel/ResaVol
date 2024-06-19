package com.dev.fly.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "villes")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@ManyToOne
    //@JoinColumn(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
