package com.sachin.cab.booking.model;

import java.time.LocalDateTime;

public class Ride {
    private String driverId;
    private String passengerId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String pickupLocation;
    private String dropoffLocation;
    private double distance; // in kilometers
    private double fare;
    private double driverRating;
    private double passengerRating;


    public Object getDriverId() {
        return null;
    }

    public String getPickupLocation() {
        return null;
    }

    public int getDropoffLocation() {
    return 1;}

    public int getFare() {
    return 1;}

    public void setDriverId(String number) {
    }

    public void setPassengerId(String number) {
    }

    public void setStartTime(LocalDateTime now) {
    }

    public void setEndTime(LocalDateTime localDateTime) {
    }

    public void setPickupLocation(String puneStation) {
    }

    public void setDropoffLocation(String hinjewadi) {
    }

    public void setDistance(double v) {
    }

    public void setFare(double v) {
    }

    public void setDriverRating(double v) {
    }

    public void setPassengerRating(double v) {
    }

    public Object getDriverId(int i) {
     return null;
    }
}
