package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {

    @PersistenceContext
    private EntityManager em;
    @Override
    public void supprimerPersonsSansAnimaux() {

        List<Person> personsSansAnimaux = em.createQuery(
                "SELECT p FROM Person p WHERE p.animals IS EMPTY", Person.class
        ).getResultList();

        for (Person p : personsSansAnimaux) {
            em.remove(p);
        }
    }

    @Override
    public void genereEntite(int nombre) {

        String[] prenoms = {"Jean", "Marie", "Pierre", "Sophie", "Lucas", "Emma", "Hugo", "Léa"};
        String[] noms = {"Dupont", "Martin", "Bernard", "Dubois", "Moreau", "Laurent", "Simon"};
        Random random = new Random();

        for(int i = 0; i < nombre; i++){
            Person person = new Person();
            person.setFirstName(prenoms[random.nextInt(prenoms.length)]);
            person.setLastName(noms[random.nextInt(noms.length)]);
            person.setAge(random.nextInt(20));
            em.persist(person);
        }

    }
}
