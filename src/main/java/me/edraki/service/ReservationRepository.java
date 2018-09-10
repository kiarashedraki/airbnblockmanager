package me.edraki.service;

import me.edraki.entity.Reservations;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservations,String> {
    public List<Reservations> findByGuestFirstName(String firstName);
    public List<Reservations> findFirstByUserId(Integer userId);
    public Reservations findById(ObjectId id);
}
