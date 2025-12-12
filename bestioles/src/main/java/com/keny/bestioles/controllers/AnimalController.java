package com.keny.bestioles.controllers;

import com.keny.bestioles.entite.Animal;
import com.keny.bestioles.repository.AnimalRepository;
import com.keny.bestioles.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping
    public Animal CreateAnimal(Animal animal) {
        return animalService.CreateAnimal(animal);
    }
    @GetMapping
    public List<Animal> GetAllAnimals() {
        return animalService.findAllAnimals();
    }
    @DeleteMapping
    public void deleteAnimal(@RequestBody Animal animal) {
         animalService.deleteAnimal(animal);
    }
    @PutMapping
    public Animal UpdateAnimal(@RequestBody Animal animal) {
        return animalService.updateAnimal(animal);
    }
    @GetMapping("{id}")
    public Optional<Animal> GetAnimalById(@PathVariable Integer id) {
        return animalService.findAnimalById(id);
    }
}
