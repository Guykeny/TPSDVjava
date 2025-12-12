package com.keny.bestioles.service;

import com.keny.bestioles.entite.Animal;
import com.keny.bestioles.entite.Species;
import com.keny.bestioles.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }




    public Animal CreateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal updateAnimal(Animal animal) {

        if(animal.getId() != null && animalRepository.existsById(animal.getId())) {
            return animalRepository.save(animal);
        }else throw new RuntimeException("l'animal n'existe pas");
    }

    public void deleteAnimal(Animal animal) {
        animalRepository.deleteById(animal.getId());
    }
    public List<Animal> findAllAnimals() {
        return animalRepository.findAll();
    }
    public Optional<Animal> findAnimalById(Integer id) {
        return animalRepository.findById(id);
    }



}
