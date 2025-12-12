package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.Set;

@RepositoryRestResource(path = "les-betes", collectionResourceRel = "les-gens")
//
public interface SpeciesRepository extends JpaRepository<Species, Integer> {

    @RestResource(exported = false)
    @Query("select  s from Species s order by s.commonName ASC ")
    Set<Species> findAllSpeciesOrderByCommonNameAsc();

    @Query("SELECT s from Species s where s.commonName like :commonName")
    Set<Species> findSpeciesByCommonName(@Param("commonName") String commonName);
    Set<Species> findByCommonName(String commonName);
    Species findFirstByCommonName(String commonName);

    Set<Species> findByLatinNameContainsIgnoreCase(String latinName);

    Set<Species> findByLatinName(String latinName);

}
