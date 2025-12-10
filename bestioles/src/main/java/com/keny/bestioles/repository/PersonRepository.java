package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Set<Person> findByFirstName(String firstName);
    Set<Person> findByLastName(String lastName);
    Optional<Person> findByid(Long id);
}
