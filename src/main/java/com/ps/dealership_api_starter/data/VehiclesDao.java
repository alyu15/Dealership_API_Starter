package com.ps.dealership_api_starter.data;

import com.ps.dealership_api_starter.models.Vehicle;

import java.util.List;

public interface VehiclesDao {

    List<Vehicle> searchVehiclePrice(double minPrice, double maxPrice);
    List<Vehicle> searchVehicleMakeModel(String make, String model);
    List<Vehicle> searchVehicleYear(int minYear, int maxYear);
    List<Vehicle> searchVehicleColor(String color);
    List<Vehicle> searchVehicleOdometer(int minMiles, int maxMiles);
    List<Vehicle> searchVehicleType(String type);
    Vehicle create(Vehicle vehicle);
    void updateVehicle(int vin, Vehicle vehicle);
    void deleteVehicle(int vin);

}
