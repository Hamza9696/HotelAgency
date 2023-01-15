package com.example.agence.model;

import jakarta.persistence.*;

@Entity
@Table(name="Hotel")
public class Hotel {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="name", nullable = false)
    private String name;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name="nb_stars", nullable = false)
    private int nbStars;
    @Column(name="nb_beds", nullable = false)
    private int nbBeds;
    @Column(name="nb_rooms", nullable = false)
    private int nbRooms;

    public Hotel(Integer id, String name, Address address, int nbStars, int nbBeds, int nbRooms) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.nbStars = nbStars;
        this.nbBeds = nbBeds;
        this.nbRooms = nbRooms;
    }

    public Hotel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNbStars() {
        return nbStars;
    }

    public void setNbStars(int nbStars) {
        this.nbStars = nbStars;
    }

    public int getNbBeds() {
        return nbBeds;
    }

    public void setNbBeds(int nbBeds) {
        this.nbBeds = nbBeds;
    }

    public int getNbRooms() {
        return nbRooms;
    }

    public void setNbRooms(int nbRooms) {
        this.nbRooms = nbRooms;
    }

    public Integer getId() {
        return id;
    }

}
