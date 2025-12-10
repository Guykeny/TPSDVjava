package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {


    Set<Animal> findByName(String name);
    Optional<Animal> findById(Long id);


}
