package com.keny.bestioles.service;

import com.keny.bestioles.entite.Animal;
import com.keny.bestioles.entite.Person;
import com.keny.bestioles.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person CreatePerson(Person person) {
        return personRepository.save(person);
    }

    public Person updatePerson(Person person) {

        if(person.getId() != null &&   personRepository.existsById(person.getId())) {
            return personRepository.save(person);
        }else throw new RuntimeException("le Personne  n'existe pas");
    }

    public void deletePerson(Person person) {
        personRepository.deleteById(person.getId());
    }
    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }
    public Optional<Person> findPersonById(Integer id) {
        return personRepository.findById(id);
    }
}
