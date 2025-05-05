package com.example.projectspringboot.repositories;

import com.example.projectspringboot.model.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoniteurRepositories extends JpaRepository<Moniteur, Integer> {

}
