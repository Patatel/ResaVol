package com.dev.fly.service.pilot;

import java.util.List;
import com.dev.fly.model.Pilot;

public interface PilotService {
    public List<Pilot> getAll();
    public void add(Pilot pilot);
    public void update(Pilot pilotParameter);
    public void delete(Long id);
    public Pilot findById(Long id);
    public Pilot getId(Pilot pilotParameter);
}