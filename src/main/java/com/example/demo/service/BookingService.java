package com.example.demo.service;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Get all bookings from the database
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Save a new booking to the database
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    // Delete a booking by its ID
    public void delete(int id) {
        bookingRepository.deleteById(id);
    }
}
