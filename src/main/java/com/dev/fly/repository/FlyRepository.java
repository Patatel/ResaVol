package com.dev.fly.repository;

import com.dev.fly.model.Fly;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<Fly, Long > {

}