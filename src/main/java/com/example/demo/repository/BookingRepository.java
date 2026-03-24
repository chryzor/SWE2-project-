package com.example.demo.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByUserName(String userName); // Find bookings by username
    List<Booking> findByRoomIDAndDate(String roomID, String date); // Find bookings by room ID and date

    // this is  query to checck if there is a conflicts with the booking 
    @Query("SELECT COUNT(b) > 0 FROM Booking b WHERE b.roomID = :roomID " +
           "AND b.date = :date " +
           "AND b.startTime < :endTime AND b.endTime > :startTime")
    boolean existsConflict(@Param("roomID") String roomID,
                           @Param("date") String date,
                           @Param("startTime") String startTime,
                           @Param("endTime") String endTime);
}
