package com.dev.fly.repository;

import com.dev.fly.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Long > {

}
