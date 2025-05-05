package com.example.projectspringboot.repositories;

import com.example.projectspringboot.model.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdherentRepositories extends JpaRepository<Adherent, Integer> {


}
