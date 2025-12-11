package com.keny.bestioles.boot;

import com.keny.bestioles.repository.AnimalRepository;
import com.keny.bestioles.repository.PersonRepository;
import com.keny.bestioles.repository.RoleRepository;
import com.keny.bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Startup implements CommandLineRunner {

    private final AnimalRepository animalRepository;
    private final PersonRepository personRepository;
    private final RoleRepository roleRepository;
    private final SpeciesRepository speciesRepository;

    @Autowired
    public Startup(AnimalRepository animalRepository, PersonRepository personRepository, RoleRepository roleRepository, SpeciesRepository speciesRepository) {
        this.animalRepository = animalRepository;
        this.personRepository = personRepository;
        this.roleRepository = roleRepository;
        this.speciesRepository = speciesRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=== Test des repositories ===");

        System.out.println("Animal :"+ animalRepository.findAll());
        System.out.println("Person :"+ personRepository.findAll());
        System.out.println("Role :"+ roleRepository.findAll());
        System.out.println("Espece :"+ speciesRepository.findAll());

        Long nbAnimals = animalRepository.count();
        Long nbPersons = personRepository.count();
        Long nbRoles = roleRepository.count();
        Long nbSpecies = speciesRepository.count();
        System.out.println("Nb animals : " + nbAnimals);
        System.out.println("Nb persons : " + nbPersons);
        System.out.println("Nb roles : " + nbRoles);
        System.out.println("Nb Species : " + nbSpecies);

        System.out.println("Animal qui s'appelle :"+ animalRepository.findByName("Lou").toString());
    }
}
