package com.example.projectspringboot.service;

import com.example.projectspringboot.model.Moniteur;
import com.example.projectspringboot.repositories.MoniteurRepositories;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MoniteurService {
    @Autowired
    private MoniteurRepositories moniteurRepositories;

    public List<Moniteur> getAllMoniteurs() {
        return moniteurRepositories.findAll();
    }

    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepositories.save(moniteur);
    }

    public Moniteur updateMoniteur(Integer id, Moniteur moniteur) {
        return moniteurRepositories.findById(id)
                .map(existingMoniteur -> {
                    existingMoniteur.setNomM(moniteur.getNomM());
                    existingMoniteur.setPrenomM(moniteur.getPrenomM());
                    return moniteurRepositories.save(existingMoniteur);
                })
                .orElseThrow(() -> new RuntimeException("Moniteur non trouvé"));
    }

    public void deleteMoniteur(Integer id) {
        moniteurRepositories.deleteById(id);
    }
}