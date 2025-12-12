package com.keny.bestioles.controllers;

import com.keny.bestioles.entite.Person;
import com.keny.bestioles.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personnes")
public class PersonContoller {

    private PersonService personService;

    @Autowired
    public PersonContoller(PersonService personService) {
        this.personService = personService;
    }




        @PostMapping
        public Person CreatePerson(Person person) {
            return personService.CreatePerson(person);
        }
        @GetMapping
        public List<Person> GetAllPersons() {
            return personService.findAllPersons();
        }
        @DeleteMapping
        public void deletePerson(@RequestBody Person person) {
            personService.deletePerson(person);
        }
        @PutMapping
        public Person UpdatePerson(@RequestBody Person person) {
            return personService.updatePerson(person);
        }
        @GetMapping("{id}")
        public Optional<Person> GetPersonById(@PathVariable Integer id) {
            return personService.findPersonById(id);
        }
}


