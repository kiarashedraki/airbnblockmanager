package me.edraki.controller;


import me.edraki.entity.Reservation;
import me.edraki.service.ReservationRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/reservations")
public class ReservationController {

    final Logger logger = LoggerFactory.getLogger(this.getClass().toString());

    @Autowired
    private ReservationRepository reservationRepository;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Reservation addGuest(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}

