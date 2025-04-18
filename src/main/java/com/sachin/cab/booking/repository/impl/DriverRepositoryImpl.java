package com.sachin.cab.booking.repository.impl;

import com.sachin.cab.booking.model.Driver;
import com.sachin.cab.booking.repository.DriverRepository;

import java.util.ArrayList;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository {
    private final List<Driver> driverList = new ArrayList<> ();

    @Override
    public void save(Driver driver) {
        driverList.add(driver);
    }

    @Override
    public Driver findById(int id) {
        return driverList.stream()
                .filter(d -> d.getDriverId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Driver> findAll() {
        return driverList;
    }

    @Override
    public void delete(int id) {
        driverList.removeIf(d -> d.getDriverId() == id);
    }

}
