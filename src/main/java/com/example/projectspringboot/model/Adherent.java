package com.example.projectspringboot.model;

import jakarta.persistence.ManyToOne;

public class Adherent {
    private int idA;
    private String nomA;
    private String prenomA;
    private String ville;


    @ManyToOne
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
}
