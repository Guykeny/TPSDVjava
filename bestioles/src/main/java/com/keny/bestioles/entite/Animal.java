package com.keny.bestioles.entite;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "color", length = 50)
    private String color;
    @Column(name ="name",length = 50)
    private String name;

    @Column(name = "sex",length = 1)
    private Character sex;
    @ManyToOne
    @JoinColumn(name="species_id")
    private Species species;

    public Animal() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Species getSpeciesId() {
        return species;
    }

    public void setSpeciesId(Species species) {
        this.species = species;
    }
}



