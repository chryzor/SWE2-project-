package com.example.demo.service;

import com.example.demo.model.Building;
import com.example.demo.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    // Get all buildings from the database
    public List<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }
}
