package com.example.projectspringboot.service;

import com.example.projectspringboot.model.Seance;
import com.example.projectspringboot.repositories.SeanceRepositories;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SeanceService {

    @Autowired
    private SeanceRepositories seanceRepositories;

    // Obtenir toutes les séances
    public List<Seance> getAllSeances() {
        return seanceRepositories.findAll();
    }

    // Ajouter une nouvelle séance
    public Seance addSeance(Seance seance) {
        return seanceRepositories.save(seance);
    }

    // Mettre à jour une séance existante
    public Seance updateSeance(Integer id, Seance seance) {
        return seanceRepositories.findById(id)
                .map(existingSeance -> {
                    existingSeance.setHeureS(seance.getHeureS());
                    existingSeance.setDateS(seance.getDateS());
                    existingSeance.setNbheures(seance.getNbheures());
                    return seanceRepositories.save(existingSeance);
                })
                .orElseThrow(() -> new RuntimeException("Séance non trouvée"));
    }

    // Supprimer une séance
    public void deleteSeance(Integer id) {
        seanceRepositories.deleteById(id);
    }
}