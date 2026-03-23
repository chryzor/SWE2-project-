package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms") // This is the way to the tell the DB that is for the mapping of the Room class 

public class Room {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id; // Room ID
    private String name; // Room name 
    private int capacity; // Room capacity 
    private int buildingId; // This is the ID of the building that the room is in

    // Getters for the Room class fields 

    public int getID() {return id;} // This method is for getting room ID 
    public String getName() {return name;} // Getting the name of the room
    public int getCapacity() {return capacity;} // Getting the capacity of the room
    public int getBuildingID() {return buildingId;} // Getting the building ID that the room is in

    // Setters for the Room class fields

    public void setID(int id ){this.id = id;} // Setting the room ID
    public void setName (String name) {this.name = name;} // Setting room name
    public void setCapacity (int capacity){this.capacity = capacity;} // This is for setting how many people the room can hold
    public void setBuildingID (int buildingID){this.buildingId = buildingID;} // This is for setting the building ID that the room is in





}