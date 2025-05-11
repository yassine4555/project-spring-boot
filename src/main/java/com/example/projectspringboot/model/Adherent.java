package com.example.projectspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "adherents")
public class Adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idA;

    private String nomA;
    private String prenomA;
    private String ville;

  @ManyToOne
  @JsonIgnore

  @JoinColumns({
    @JoinColumn(name = "dateS", referencedColumnName = "dateS"), // Colonne 1 de la clé composite
    @JoinColumn(name = "heureS", referencedColumnName = "heureS") // Colonne 2 de la clé composite
  })
// Colonne de jointure pour seance
    private Seance seance;

    public void setNomA(String nomA) {
        this.nomA = nomA;
    }

    public void setPrenomA(String prenomA) {
        this.prenomA = prenomA;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getIdA() {
        return idA;
    }

    public String getNomA() {
        return nomA;
    }

    public String getPrenomA() {
        return prenomA;
    }

    public String getVille() {
        return ville;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }
}
