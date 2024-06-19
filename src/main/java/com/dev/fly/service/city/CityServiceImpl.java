package com.dev.fly.service.city;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.fly.model.City;
import com.dev.fly.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public void add(City city) {
        cityRepository.save(city);
    }

    @Override
    public void update(City cityParameter) {
        if (findById(cityParameter.getId()) != null) {
            cityRepository.save(cityParameter);
        }
    }

    @Override
    public void delete(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public City findById(Long id) {
        Optional<City> optionalCity = cityRepository.findById(id);
        if (optionalCity.isPresent()) {
            return optionalCity.get();
        }
        return null;
    }

    @Override
    public City getId(City cityParameter) {
        return null;
    }

}

