package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This annotation indicates that this class is a JPA entity, which means it will be mapped to a database table.
@Table(name = "buildings") // This annotation specifies the name of the database table that this entity will be mapped to, in this case, "buildings".

public class Building {
    @Id // This for making sure the DB knows that this is the primary key of the building entity  it  identifies each building in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This is for auto-numbering it for me 

    private int id; // Id of the building
    private String name; // Name of the building
    private String location; // This is the location of the building 
    
    
    // Getters for the fields of the Building class

    public int getID() {return id;} // This method is for getting the building ID
    public String getName() {return name;} // Gettting the name of the building
    public String getLocation() {return location;} // Getting the location of the building

    // Setters for the fields of the Building class

    public void setID(int id){this.id = id;} //For setting the building ID
    public void setName(String name){this.name = name;} // for setting the name of the building
    public void setLocation(String location){this.location = location;} // for setting the location of the building

    }