package com.keny.bestioles.entite;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String label;
    @ManyToMany
    @JoinTable(
            name = "person_role",
            joinColumns =@JoinColumn(name="role_id"),
            inverseJoinColumns = @JoinColumn(name="person_id")

    )
    private Set<Person> personnes= new HashSet<>();
    public Role() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
