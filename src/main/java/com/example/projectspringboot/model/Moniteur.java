package com.example.projectspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "moniteurs")
public class Moniteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idM;

    private String nomM;
    private String prenomM;

    // Relation avec Seance (Many-To-One)
    @ManyToOne
    @JsonIgnore

    @JoinColumns({
      @JoinColumn(name = "dateS", referencedColumnName = "dateS"), // Colonne 1 de la clé composite
      @JoinColumn(name = "heureS", referencedColumnName = "heureS") // Colonne 2 de la clé composite
    })
    // Colonne dans la table "moniteurs"
    private Seance seance;

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }
}
