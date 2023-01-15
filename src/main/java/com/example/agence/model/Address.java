package com.example.agence.model;

import jakarta.persistence.*;

@Entity
@Table(name="Address")
public class Address {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="country", nullable = false)
    private String country;
    @Column(name="city", nullable = false)
    private String city;
    @Column(name="zip_code", nullable = false)
    private int zipCode;
    @Column(name="street", nullable = false)
    private String street;
    @Column(name="gp_x", nullable = false)
    private int gpX;
    @Column(name="gp_y", nullable = false)
    private int gpY;



    public Address(String country, String city, int zipCode, String street, int gpX, int gpY) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.gpX = gpX;
        this.gpY = gpY;
    }

    public Address() {

    }

    public Integer getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getGpX() {
        return gpX;
    }

    public void setGpX(int gpX) {
        this.gpX = gpX;
    }

    public int getGpY() {
        return gpY;
    }

    public void setGpY(int gpY) {
        this.gpY = gpY;
    }
}
