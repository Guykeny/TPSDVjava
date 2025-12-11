package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Animal;
import com.keny.bestioles.entite.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>, PersonRepositoryCustom {


    @Query("select p from Person p where p.age between :ageMin and :ageMax")
    Set<Person> findByAgeBetween(@Param("ageMin") int ageMin, @Param("ageMax") int ageMax);


    @Query("select p from Person p join p.animals a where a= :animal ")
    Set<Person> findByAnimal(@Param("animal") Animal animal);
    Set<Person> findByFirstNameOrLastName(String firstName,String lastName);
    Set<Person> findByAgeGreaterThan(int age);
   // Set<Person> findByAgeLessThan(int age);
    Set<Person> findByLastName(String lastName);
    Optional<Person> findByid(Long id);
}
