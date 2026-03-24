package com.example.demo.controller;

import com.example.demo.model.Building;
import com.example.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/buildings")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    // GET /api/buildings  return all buildings as JSON
    @GetMapping
    public List<Building> getAll() {
        return buildingService.getAllBuildings();
    }
}
