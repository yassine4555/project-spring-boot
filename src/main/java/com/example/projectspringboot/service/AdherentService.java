package com.example.projectspringboot.service;

import com.example.projectspringboot.model.Adherent;
import com.example.projectspringboot.repositories.AdherentRepositories;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AdherentService {
    @Autowired
    private AdherentRepositories adherentRepositories;
    public List<Adherent> getAllAdherent() {
        return adherentRepositories.findAll();
    }
    public Adherent addAdherent(Adherent adherent) {
        return adherentRepositories.save(adherent);
    }
    public Adherent UpdateAdherent(long id, Adherent adherent) {
        return adherentRepositories.findById((int) id)
                .map(existingAdherent -> {
                    existingAdherent.setNomA(adherent.getNomA());
                    existingAdherent.setPrenomA(adherent.getPrenomA());
                    return adherentRepositories.save(existingAdherent);
                })
                .orElseThrow(() -> new RuntimeException("adherent non trouvé"));
    }
    public void deleteAdherent(int id) {
        adherentRepositories.deleteById(id);
    }


}
