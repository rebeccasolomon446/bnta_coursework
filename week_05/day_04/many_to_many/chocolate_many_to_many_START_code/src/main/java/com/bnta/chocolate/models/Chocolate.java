package com.bnta.chocolate.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chocolates")
public class Chocolate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;
    @Column(name = "cocoa_percentage")
    private int cocoaPercentage;

    @ManyToMany
    @JoinTable(
            name = "chocolates_estates",                         // owning side: describes the many-to-many relationship
            joinColumns = @JoinColumn(name = "chocolate_id"),   // first since we are in the chocolate class
            inverseJoinColumns = @JoinColumn(name = "estate_id")
    )
    @JsonIgnoreProperties({"chocolates"})    // ignores chocolate in the table
    private List<Estate> estates;

    public Chocolate(String name, int cocoaPercentage) {
        this.name = name;
        this.cocoaPercentage = cocoaPercentage;
        this.estates = new ArrayList<>();
    }

    public Chocolate() {
    }

    public void addEstate(Estate estate) {
        this.estates.add(estate);
    }

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

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    public List<Estate> getEstates() {
        return estates;
    }

    public void setEstates(List<Estate> estates) {
        this.estates = estates;
    }
}
