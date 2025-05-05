package com.example.projectspringboot.repositories;

import com.example.projectspringboot.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepositories extends JpaRepository<Seance, Integer> {
}
