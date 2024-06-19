package com.dev.fly.controller;

import com.dev.fly.service.fly.FlyServiceImpl;
import com.dev.fly.service.pilot.PilotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.fly.model.Pilot;

@Controller
@RequestMapping("/pilot")
public class PilotController {
    @Autowired
    private PilotServiceImpl pilotService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("pilot", pilotService.getAll());
        return "pilot/list";
    }

    @GetMapping("/add")
    public String displayAddForm(Pilot pilot) {
        return "pilot/add";
    }

    @PostMapping("/add")
    public String processAdd(Pilot pilot) {
        pilotService.add(pilot);
        return "redirect:/pilot/list";
    }

    @GetMapping("/update/{id}")
    public String displayUpdateForm(@PathVariable("id") Long id, Model model) {
        Pilot pilot = pilotService.findById(id);
        model.addAttribute("pilot", pilot);
        return "pilot/update";
    }

    @PostMapping("/update")
    public String processUpdate(Pilot pilot) {
        pilotService.update(pilot);
        return "redirect:/pilot/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        pilotService.delete(id);
        return "redirect:/pilot/list";
    }
}