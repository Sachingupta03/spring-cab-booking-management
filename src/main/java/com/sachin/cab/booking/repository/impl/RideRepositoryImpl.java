package com.sachin.cab.booking.repository.impl;

import com.sachin.cab.booking.model.Ride;
import com.sachin.cab.booking.repository.RideRepository;

import java.util.ArrayList;
import java.util.List;

public class RideRepositoryImpl implements RideRepository {
    private List<Ride> rideList = new ArrayList<>();

    @Override
    public void save(Ride ride) {
        rideList.add(ride);
        System.out.println("Ride saved successfully!");
    }

    @Override
    public List<Ride> findAll() {
        return rideList;
    }

    @Override
    public Ride findByDriverId(String driverId) {
        for (Ride ride : rideList) {
            // Null check added to prevent NullPointerException
            if (ride.getDriverId() != null && ride.getDriverId().equals(driverId)) {
                return ride;
            }
        }
        return null;
    }
}
