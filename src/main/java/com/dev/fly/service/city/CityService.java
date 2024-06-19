package com.dev.fly.service.city;

import java.util.List;
import com.dev.fly.model.City;

public interface CityService {
    public List<City> getAll();
    public void add(City city);
    public void update(City cityParameter);
    public void delete(Long id);
    public City findById(Long id);
    public City getId(City cityParameter);
}
