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
    public static List<Adherent> getAllAdherent() {
        return AdherentService.findAll();
    }
    public static Adherent addAdherent(Adherent adherent) {
        return AdherentService.save(adherent);
    }
    public static Adherent UpdateAdherent(long id, Adherent adherent){
    return AdherentRepositories.findById(id)
    .map(Adherent adherent ->{
        adherent.setNomA(UpdateAdherent.getNomA());
        adherent.setPrenomA(UpdateAdherent.getPrenomA());
        return AdherentRepositories.save(adherent);
    })
            .orElseThrow(() -> new RuntimeException("adherent non trouvé"));
    }
    public void deleteAdherent(int id) {
        adherentRepositories.deleteById(id);
    }


}
