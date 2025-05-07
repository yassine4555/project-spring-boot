package com.example.projectspringboot.model;

import jakarta.persistence.*;




    @Entity
    @Table(name = "moniteurs")
    public class Moniteur {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idM;

        private String nomM;
        private String prenomM;

        // Relation Many-to-One avec Adherent
        @ManyToOne
        @JoinColumn(name = "adherent_id") // Colonne pour le mapping
        private Adherent adherent;

        public int getIdM() {
            return idM;
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

        public Adherent getAdherent() {
            return adherent;
        }

        public void setAdherent(Adherent adherent) {
            this.adherent = adherent;
        }
    }




