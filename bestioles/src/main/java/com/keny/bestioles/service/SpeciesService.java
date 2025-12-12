package com.keny.bestioles.service;

import com.keny.bestioles.entite.Species;
import com.keny.bestioles.repository.AnimalRepository;
import com.keny.bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpeciesService {
    
    private final SpeciesRepository speciesRepository;

    @Autowired
    public SpeciesService(SpeciesRepository speciesRepository) {
        this.speciesRepository = speciesRepository;
    }
    public Species CreateSpecies(Species Species) {
        return speciesRepository.save(Species);
    }

    public Species updateSpecies(Species Species) {

        if(Species.getId() != null &&   speciesRepository.existsById(Species.getId())) {
            return speciesRepository.save(Species);
        }else throw new RuntimeException("le Speciesne  n'existe pas");
    }

    public void deleteSpecies(Species Species) {
        speciesRepository.deleteById(Species.getId());
    }
    public List<Species> findAllSpeciess() {
        return speciesRepository.findAll();
    }
    public Optional<Species> findSpeciesById(Integer id) {
        return speciesRepository.findById(id);
    }
}
