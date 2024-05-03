package com.boda.proyectoPPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "guest")
public class guestModel {
    @Id
    @Column(unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String numberOfCompanions;
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfCompanions() {
        return numberOfCompanions;
    }

    public void setNumberOfCompanions(String numberOfCompanions) {
        this.numberOfCompanions = numberOfCompanions;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
