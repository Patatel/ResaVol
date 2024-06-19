package com.dev.fly.service.pilot;

import java.util.List;
import java.util.Optional;

import com.dev.fly.model.Pilot;
import com.dev.fly.repository.PilotRepository;
import com.dev.fly.service.pilot.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotServiceImpl implements PilotService {

    @Autowired
    PilotRepository pilotRepository;

    @Override
    public List<Pilot> getAll() {
        return pilotRepository.findAll();
    }

    @Override
    public void add(Pilot pilot) {
        pilotRepository.save(pilot);
    }

    @Override
    public void update(Pilot pilotParameter) {
        if (findById(pilotParameter.getId()) != null) {
            pilotRepository.save(pilotParameter);
        }
    }

    @Override
    public void delete(Long id) {
        pilotRepository.deleteById(id);
    }

    @Override
    public Pilot findById(Long id) {
        Optional<Pilot> optionalPilot= pilotRepository.findById(id);
        if (optionalPilot.isPresent()) {
            return optionalPilot.get();
        }
        return null;
    }

    @Override
    public Pilot getId(Pilot pilotParameter) {
        return null;
    }

}