package com.sachin.cab.booking;

import com.sachin.cab.booking.controller.UserController;
import com.sachin.cab.booking.controller.DriverController;
import com.sachin.cab.booking.controller.RideController;
import com.sachin.cab.booking.controller.PaymentController;
import com.sachin.cab.booking.model.Ride;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // ------------------ User Section ------------------
        UserController userController = context.getBean("userController", UserController.class);
        userController.createUser(1, "Sachin", "Pune", "9876543210");
        userController.createUser(2, "Amit", "Delhi", "9123456789");
        userController.listUsers();
        userController.getUser(1);
        userController.deleteUser(2);
        userController.listUsers();

        // ------------------ Driver Section ------------------
        DriverController driverController = context.getBean("driverController", DriverController.class);
        driverController.createDriver(101, "Raj", "9999988888", "MH1234567", 5);
        driverController.createDriver(102, "Vikram", "8888877777", "UP4567890", 3);
        driverController.listDrivers();
        driverController.getDriver(101);
        driverController.deleteDriver(102);
        driverController.listDrivers();

        // ------------------ Ride Section ------------------
        RideController rideController = context.getBean("rideController", RideController.class);
        Ride ride1 = new Ride();
        ride1.setDriverId("101");
        ride1.setPassengerId("1");
        ride1.setStartTime(LocalDateTime.now());
        ride1.setEndTime(LocalDateTime.now().plusMinutes(25));
        ride1.setPickupLocation("Pune Station");
        ride1.setDropoffLocation("Hinjewadi");
        ride1.setDistance(15.0);
        ride1.setFare(200.0);
        ride1.setDriverRating(4.9);
        ride1.setPassengerRating(4.8);

        rideController.createRide(ride1);
        rideController.showAllRides();
        rideController.showRideByDriver("101");

        // ------------------ Payment Section ------------------
        PaymentController paymentController = context.getBean("paymentController", PaymentController.class);
        paymentController.makePayment("R123", "1", 200.0, "TXN001", "INR", "Ride from Pune Station to Hinjewadi", "SUCCESS");
        paymentController.listAllPayments();
        paymentController.findPayment("TXN001");
    }
}
