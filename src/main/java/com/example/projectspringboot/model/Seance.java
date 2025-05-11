package com.example.projectspringboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@IdClass(SeanceId.class) // Classe externe peut rester simple.
@Table(name = "seances")
public class Seance {
  @Id
  private int dateS; // Champ 1 de la clé composite.
  @Id
  private int heureS;



    private int Nbheures;

    // Relation One-To-Many avec Moniteur




  // Clé étrangère vers Moniteur
  @OneToMany(mappedBy = "seance", cascade = CascadeType.ALL)
  private List<Moniteur> moniteurs;
  @JsonManagedReference

  // Relation One-to-Many avec Adherent
  @OneToMany(mappedBy = "seance", cascade = CascadeType.ALL)
  private List<Adherent> adherents;
  @JsonManagedReference





  public int getDateS() { return dateS; }
  public void setDateS(int dateS) { this.dateS = dateS; }

  public int getHeureS() { return heureS; }
  public void setHeureS(int heureS) { this.heureS = heureS; }

  public int getNbheures() { return Nbheures; }
  public void setNbheures(int Nbheures) { this.Nbheures = Nbheures; }

  public List<Moniteur> getMoniteurs() { return moniteurs; }
  public void setMoniteurs(List<Moniteur> moniteurs) { this.moniteurs = moniteurs; }

  public List<Adherent> getAdherents() { return adherents; }
  public void setAdherents(List<Adherent> adherents) { this.adherents = adherents; }
}


