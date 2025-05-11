package com.example.projectspringboot.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeanceId implements Serializable {

    private int dateS;
    private int heureS;

    public SeanceId() {
    }

    public SeanceId(int dateS, int heureS) {
        this.dateS = dateS;
        this.heureS = heureS;
    }

    public int getDateS() {
        return dateS;
    }

    public void setDateS(int dateS) {
        this.dateS = dateS;
    }

    public int getHeureS() {
        return heureS;
    }

    public void setHeureS(int heureS) {
        this.heureS = heureS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeanceId seanceId = (SeanceId) o;
        return dateS == seanceId.dateS && heureS == seanceId.heureS;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateS, heureS);
    }
}