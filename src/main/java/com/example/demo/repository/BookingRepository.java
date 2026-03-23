package com.example.demo.repository;

import com.example.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByUserName(String userName); // Find bookings by username
    List<Booking> findByRoomIDAndDate(String roomID, String date); // Find bookings by room ID and date
}
