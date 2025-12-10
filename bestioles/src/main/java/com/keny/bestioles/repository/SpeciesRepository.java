package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {

    Set<Species> findByCommonName(String commonName);

    Set<Species> findByLatinName(String latinName);

}
