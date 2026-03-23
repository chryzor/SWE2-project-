package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "bookings")


public class Booking {
    @Id // This is the primary key of the booking entity  it  identifies each booking in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  @Table(name = "bookings") names that table "bookings
    private int id; // Unique identifier for the booking
    private String userName; // Name of the customer who made the booking
    private String roomID; // ID of the room that is booked
    private String date;  // Date for room booking 
    private String startTime; // Start time for room booking
    private String endTime; // End time for room booking

// Getter reads the values of the fields and give me back an integer or a string they access the private fields of the class and return their values

// This method is for getting the booking ID. It returns the value of the id field
public int getID() {return id;}

// This method is for getting the username  it also returns the value of the userName field
public String getUserName() {return userName;}

// Getter for roomID, it returns the value of the roomID field
public String getRoomID(){return roomID;}

// This get the date of the booking it returns the value of the date field
public String  getDate(){return date;}

// Getting the start time of the booking 
public String getStartTime() {return startTime;}

// Getting the end time of the booking this returns the value of the endTime field 
public String getEndTime(){ return endTime;}

// Setters are used to writes the values 

// This is for setting the booking ID and it takes an integer as a parameter and assigns it to the id field
public void setID(int id){this.id = id;} 

// This method is for setting the username 
public void setUserName(String userName){this.userName = userName;}

// This is for setting the date of the booking 
public void setRoomID(String roomID){this.roomID = roomID;}

// This is for setting the date of the booking
public void setDate(String date){this.date = date;}

// This is for setting the start time of the booking
public void setStartTime(String startTime){this.startTime = startTime;}

// This is for setting the end time of the booking
public void setEndTime(String endTime){this.endTime =endTime;}

}

