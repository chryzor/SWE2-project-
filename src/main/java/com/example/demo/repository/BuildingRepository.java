package com.example.demo.repository;

import com.example.demo.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository 

public interface BuildingRepository extends JpaRepository<Building, Integer> {

    List<Building> findByNameAndLocation(String name, String location); // Find buildings by name and location


}
