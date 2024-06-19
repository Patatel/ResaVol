package com.dev.fly.service.fly;

import java.util.List;
import com.dev.fly.model.Fly;

public interface FlyService {
    public List<Fly> getAll();
    public void add(Fly fly);
    public void update(Fly flyParameter);
    public void delete(Long id);
    public Fly findById(Long id);
    public Fly getId(Fly flyParameter);
}