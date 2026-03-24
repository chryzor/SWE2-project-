package com.example.demo.controller;

import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    //bookings  return all bookings as JSON
    @GetMapping
    public List<Booking> getAll() {
        return bookingService.getAllBookings();
    }

    //bookings create a new booking
    @PostMapping
    public Booking create(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }

    // cancel a booking
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        bookingService.delete(id);
    }
}
