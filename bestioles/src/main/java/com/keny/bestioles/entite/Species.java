package com.keny.bestioles.entite;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "common_name", nullable = false)
    private String commonName;
    @Column(name="latin_name")
    private String latinName;
    @OneToMany(mappedBy="species")
    private Set<Animal> animals;
    public Species() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
}
