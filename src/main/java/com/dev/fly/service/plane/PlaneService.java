package com.dev.fly.service.plane;

import com.dev.fly.model.Plane;

import java.util.List;

public interface PlaneService {
    public List<Plane> getAll();
    public void add(Plane plane);
    public void update(Plane cityParameter);
    public void delete(Long id);
    public Plane findById(Long id);
    public Plane getId(Plane planeParameter);
}
