package com.dev.fly.controller;

import com.dev.fly.service.city.CityService;
import com.dev.fly.service.fly.FlyServiceImpl;
import com.dev.fly.service.plane.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.fly.model.Fly;

@Controller
@RequestMapping("/fly")
public class FlyController {

    @Autowired
    private FlyServiceImpl flyService;
    @Autowired
    private CityService cityService;
    @Autowired
    private PlaneService planeService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("fly", flyService.getAll());
        return "fly/list";
    }

    @GetMapping("/add")
    public String displayAddForm(Fly fly, Model model) {
        model.addAttribute("fly",flyService.getAll());
        model.addAttribute("plane",planeService.getAll());
        model.addAttribute("city",cityService.getAll());
        return "fly/add";
    }

    @PostMapping("/add")
    public String processAdd(Fly fly) {
        flyService.add(fly);
        return "redirect:/fly/list";
    }

    @GetMapping("/update/{id}")
    public String displayUpdateForm(@PathVariable("id") Long id, Model model) {
        Fly fly = flyService.findById(id);
        model.addAttribute("fly", fly);
        return "fly/update";
    }

    @PostMapping("/update")
    public String processUpdate(Fly fly) {
        flyService.update(fly);
        return "redirect:/fly/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        flyService.delete(id);
        return "redirect:/fly/list";
    }
}
