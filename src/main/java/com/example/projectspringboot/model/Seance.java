package com.example.projectspringboot.model;

public class Seance {
    private int heureS;
    private int dateS;
    private int Nbheures;
    private Adherent adherent;
    private Moniteur moniteur;

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
    public void setNbheures(int nbheures) {
        Nbheures = nbheures;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }
    public void setMoniteur(Moniteur moniteur) {
        this.moniteur = moniteur;
    }
}
