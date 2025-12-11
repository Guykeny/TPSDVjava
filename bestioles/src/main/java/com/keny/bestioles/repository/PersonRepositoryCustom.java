package com.keny.bestioles.repository;

import com.keny.bestioles.entite.Person;

public interface PersonRepositoryCustom {

    void supprimerPersonsSansAnimaux();

    void genereEntite(int nombre);
}
