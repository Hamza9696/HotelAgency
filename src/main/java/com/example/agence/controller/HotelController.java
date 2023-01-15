package com.example.agence.controller;

import com.example.agence.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;   //Dependency Injection
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HotelController {
    private final HotelRepository hotelRepository;

    public HotelController(@Autowired HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
        // this.hotelRepository = new HotelRepository();

    }

    @RequestMapping(value ="/list", method = RequestMethod.GET)
    public String listHotels() {
        return "hotel";    //prefix/ --- /suffix
    }
}
