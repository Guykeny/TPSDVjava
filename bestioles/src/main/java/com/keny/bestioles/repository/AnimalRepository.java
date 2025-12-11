package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Animal;
import com.keny.bestioles.entite.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Repository

public interface AnimalRepository extends JpaRepository<Animal, Integer> {


    @Query("select count(a) from Animal a where a.sex= :sex")
    Integer findBysex(@Param("sex") Character sex);
    @Query("select case when  count(p)>0 then true else false end from Person  p join p.animals a where a=:animal")
    boolean belongsToSomeone(@Param("animal") Animal animal);
    Animal findByName(String name);
    Set<Animal> findBySpecies(Species species);

    Set<Animal> findByColorIn(Set<String> colors);

    Optional<Animal> findById(Long id);


}
