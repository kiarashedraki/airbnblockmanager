package me.edraki.service;

import me.edraki.entity.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservation,String> {
    public List<Reservation> findByGuestFirstName(String firstName);
    public List<Reservation> findFirstByUserId(Integer userId);
}
