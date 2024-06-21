package com.ps.dealership_api_starter.data.mysql;

import com.ps.dealership_api_starter.data.VehiclesDao;
import com.ps.dealership_api_starter.models.Vehicle;

import javax.sql.DataSource;
import java.util.List;

public class MySqlVehiclesDao extends MySqlDaoBase implements VehiclesDao {

    public MySqlVehiclesDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<Vehicle> searchVehiclePrice(double minPrice, double maxPrice) {
        return List.of();
    }

    public List<Vehicle> searchVehicleMakeModel(String make, String model) {
        return List.of();
    }

    public List<Vehicle> searchVehicleYear(int minYear, int maxYear) {
        return List.of();
    }

    public List<Vehicle> searchVehicleColor(String color) {
        return List.of();
    }

    public List<Vehicle> searchVehicleOdometer(int minMiles, int maxMiles) {
        return List.of();
    }

    public List<Vehicle> searchVehicleType(String type) {
        return List.of();
    }

    public Vehicle create(Vehicle vehicle) {
        return vehicle;
    }

    public void updateVehicle(int vin, Vehicle vehicle) {

    }

    public void deleteVehicle(int vin) {

    }

}
