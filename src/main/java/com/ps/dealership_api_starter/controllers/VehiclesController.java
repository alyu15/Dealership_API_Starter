package com.ps.dealership_api_starter.controllers;

import com.ps.dealership_api_starter.data.VehiclesDao;
import com.ps.dealership_api_starter.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicles")
@CrossOrigin

public class VehiclesController {

private VehiclesDao vehiclesDao;

    @Autowired
    public VehiclesController(VehiclesDao vehiclesDao) {
        this.vehiclesDao = vehiclesDao;
    }


}
