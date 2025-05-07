package com.example.projectspringboot.controller;

import com.example.projectspringboot.model.Seance;
import com.example.projectspringboot.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seances")
public class SeanceController {

    @Autowired
    private SeanceService seanceService;

    // Obtenir toutes les séances
    @GetMapping
    public List<Seance> getAllSeances() {
        return seanceService.getAllSeances();
    }

    // Ajouter une nouvelle séance
    @PostMapping
    public Seance addSeance(@RequestBody Seance seance) {
        return seanceService.addSeance(seance);
    }

    // Mettre à jour une séance existante
    @PutMapping("/{id}")
    public Seance updateSeance(@PathVariable Integer id, @RequestBody Seance seance) {
        return seanceService.updateSeance(id, seance);
    }

    // Supprimer une séance
    @DeleteMapping("/{id}")
    public void deleteSeance(@PathVariable Integer id) {
        seanceService.deleteSeance(id);
    }
}