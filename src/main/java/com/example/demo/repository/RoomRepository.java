package com.example.demo.repository;

import com.example.demo.model.Room;        
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

    // Find all rooms in a specific building
    List<Room> findByBuildingId(int buildingId);

    // Find rooms that fit a certain number of people
    List<Room> findByCapacityGreaterThanEqual(int capacity);
}
