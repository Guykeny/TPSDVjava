package com.keny.bestioles;

import com.keny.bestioles.entite.Animal;
import com.keny.bestioles.repository.AnimalRepository;
import com.keny.bestioles.repository.PersonRepository;
import com.keny.bestioles.repository.RoleRepository;
import com.keny.bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class BestiolesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }

}
