package com.example.projectspringboot.controller;

import com.example.projectspringboot.model.Adherent;
import com.example.projectspringboot.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adherent")
public class AdherentController {

    @Autowired
    private AdherentService adherentService;
    @GetMapping
    public List<Adherent> getAllAdherent() { return adherentService.getAllAdherent(); }
    @PostMapping
    public Adherent addAdherent( @RequestBody Adherent adherent) {
        return adherentService.addAdherent(adherent);
    }
    @PutMapping("/{id}")
    public Adherent UpdateAdherent( @PathVariable long id ,@Validated @RequestBody Adherent adherent ) {
        return adherentService.UpdateAdherent(id,adherent);
    }

}
