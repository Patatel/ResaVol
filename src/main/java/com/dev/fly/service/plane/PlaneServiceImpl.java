package com.dev.fly.service.plane;

import java.util.List;
import java.util.Optional;

import com.dev.fly.service.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.fly.model.Plane;
import com.dev.fly.repository.PlaneRepository;

@Service
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    PlaneRepository planeRepository;

    @Override
    public List<Plane> getAll() {
        return planeRepository.findAll();
    }

    @Override
    public void add(Plane plane) {
        planeRepository.save(plane);
    }

    @Override
    public void update(Plane planeParameter) {
        if (findById(planeParameter.getId()) != null) {
            planeRepository.save(planeParameter);
        }
    }

    @Override
    public void delete(Long id) {
        planeRepository.deleteById(id);
    }

    @Override
    public Plane findById(Long id) {
        Optional<Plane> optionalCity = planeRepository.findById(id);
        if (optionalCity.isPresent()) {
            return optionalCity.get();
        }
        return null;
    }

    @Override
    public Plane getId(Plane planeParameter) {
        return null;
    }

}
