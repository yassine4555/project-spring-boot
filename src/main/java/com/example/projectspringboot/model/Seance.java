package com.example.projectspringboot.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "seances")
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int heureS;
    private int dateS;
    private int Nbheures;

    // Relation One-To-Many avec Moniteur
    @OneToMany(mappedBy = "seance", cascade = CascadeType.ALL)
    private List<Moniteur> moniteurs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeureS() {
        return heureS;
    }

    public void setHeureS(int heureS) {
        this.heureS = heureS;
    }

    public int getDateS() {
        return dateS;
    }

    public void setDateS(int dateS) {
        this.dateS = dateS;
    }

    public int getNbheures() {
        return Nbheures;
    }

    public void setNbheures(int Nbheures) {
        this.Nbheures = Nbheures;
    }

    public List<Moniteur> getMoniteurs() {
        return moniteurs;
    }

    public void setMoniteurs(List<Moniteur> moniteurs) {
        this.moniteurs = moniteurs;
    }
}