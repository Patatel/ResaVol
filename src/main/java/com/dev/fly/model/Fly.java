package com.dev.fly.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "vols")
public class Fly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fly_id;

    private Integer plan_id;

    private Integer city_departur;

    private Integer city_arrival;

    private Date departurTime;

    private Date arrivalTime;

    public Long getId() {
        return id;
    }
}

