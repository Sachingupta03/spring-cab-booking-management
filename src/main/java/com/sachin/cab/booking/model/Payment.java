package com.sachin.cab.booking.model;

import java.time.LocalDateTime;

public class Payment {

    private String rideId;  // Nullable for non-ride payments
    private String userId;
    private double amount;
    private LocalDateTime transactionTime;
    private String transactionReference;
    private String currency;
    private String description;
    private String PaymentStatus;

    public Payment(String rideId, String userId, double amount, LocalDateTime now, String ref, String currency, String desc, String status) {
    }

    public Object getTransactionReference() {
        return null;
    }
}
