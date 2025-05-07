package com.example.projectspringboot.controller;

import com.example.projectspringboot.model.Moniteur;
import com.example.projectspringboot.service.MoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moniteurs")
public class MoniteurController {

    @Autowired
    private MoniteurService moniteurService;

    @GetMapping
    public List<Moniteur> getAllMoniteurs() {
        return moniteurService.getAllMoniteurs();
    }

    @PostMapping
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);
    }

    @PutMapping("/{id}")
    public Moniteur updateMoniteur(@PathVariable Integer id, @RequestBody Moniteur moniteur) {
        return moniteurService.updateMoniteur(id, moniteur);
    }

    @DeleteMapping("/{id}")
    public void deleteMoniteur(@PathVariable Integer id) {
        moniteurService.deleteMoniteur(id);
    }
}