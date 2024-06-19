package com.dev.fly.service.fly;

import java.util.List;
import java.util.Optional;

import com.dev.fly.model.Fly;
import com.dev.fly.repository.FlyRepository;
import com.dev.fly.service.fly.FlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.fly.model.City;
import com.dev.fly.repository.CityRepository;

@Service
public class FlyServiceImpl implements FlyService {

    @Autowired
    FlyRepository flyRepository;

    @Override
    public List<Fly> getAll() {
        return flyRepository.findAll();
    }

    @Override
    public void add(Fly fly) {
        flyRepository.save(fly);
    }

    @Override
    public void update(Fly flyParameter) {
        if (findById(flyParameter.getId()) != null) {
            flyRepository.save(flyParameter);
        }
    }

    @Override
    public void delete(Long id) {
        flyRepository.deleteById(id);
    }

    @Override
    public Fly findById(Long id) {
        Optional<Fly> optionalFly = flyRepository.findById(id);
        if (optionalFly.isPresent()) {
            return optionalFly.get();
        }
        return null;
    }

    @Override
    public Fly getId(Fly flyParameter) {
        return null;
    }

}

