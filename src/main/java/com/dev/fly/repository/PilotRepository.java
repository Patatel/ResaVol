package com.dev.fly.repository;

import com.dev.fly.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, Long > {

}
