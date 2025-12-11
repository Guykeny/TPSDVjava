package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Animal;
import com.keny.bestioles.entite.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {


    Set<Animal> findByName(String name);
    Set<Animal> findBySpecies(Species species);

    Set<Animal> findByColorIn(Collection<String> colors);

    Optional<Animal> findById(Long id);


}
