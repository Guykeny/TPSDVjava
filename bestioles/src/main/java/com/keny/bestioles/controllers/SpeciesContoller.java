package com.keny.bestioles.controllers;

import com.keny.bestioles.entite.Species;
import com.keny.bestioles.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/species")
public class SpeciesContoller {

    private SpeciesService speciesService;

    @Autowired
    public SpeciesContoller(SpeciesService speciesService) {
        this.speciesService = speciesService;
    }
    
    @PostMapping
    public Species CreateSpecies(@RequestBody Species species) {
        return speciesService.CreateSpecies(species);
    }
    @GetMapping
    public List<Species> GetAllSpeciess() {
        return speciesService.findAllSpeciess();
    }
    @DeleteMapping
    public void deleteSpecies(@RequestBody Species species) {
        speciesService.deleteSpecies(species);
    }
    @PutMapping
    public Species UpdateSpecies(@RequestBody Species species) {
        return speciesService.updateSpecies(species);
    }
    @GetMapping("{id}")
    public Optional<Species> GetSpeciesById(@PathVariable Integer id) {
        return speciesService.findSpeciesById(id);
    }
}
