package com.example.agence.model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="arrival_date", nullable = false)
    private Date arrivalDAte;
    @Column(name="departure_date", nullable = false)
    private Date departureDate;
    @ManyToOne(cascade = CascadeType.ALL)    // delete_on_cascade
    @JoinColumn(name = "client_id", nullable = false) // can't create a reservation without client
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)    // delete_on_cascade
    @JoinColumn(name = "hotel_id", nullable = false) // can't create a reservation without client
    private Hotel hotel;

    private int nbPerson;

    public Reservation(Integer id, Date arrivalDAte, Date departureDate, Client client, Hotel hotel, int nbPerson) {
        this.id = id;
        this.arrivalDAte = arrivalDAte;
        this.departureDate = departureDate;
        this.client = client;
        this.hotel = hotel;
        this.nbPerson = nbPerson;
    }

    public Reservation() {}

    public Integer getId() {
        return id;
    }

    public Date getArrivalDAte() {
        return arrivalDAte;
    }

    public void setArrivalDAte(Date arrivalDAte) {
        this.arrivalDAte = arrivalDAte;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getNbPerson() {
        return nbPerson;
    }

    public void setNbPerson(int nbPerson) {
        this.nbPerson = nbPerson;
    }
}
