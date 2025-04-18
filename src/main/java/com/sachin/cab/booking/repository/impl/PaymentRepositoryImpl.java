package com.sachin.cab.booking.repository.impl;

import com.sachin.cab.booking.model.Payment;
import com.sachin.cab.booking.repository.PaymentRepository;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepositoryImpl implements PaymentRepository {

    private List<Payment> paymentList = new ArrayList<>();

    @Override
    public void save(Payment payment) {
        paymentList.add(payment);
        System.out.println("Payment saved successfully!");
    }

    @Override
    public List<Payment> findAll() {
        return paymentList;
    }

    @Override
    public Payment findByTransactionRef(String transactionRef) {
        for (Payment payment : paymentList) {
            if (payment.getTransactionReference() != null &&
                    payment.getTransactionReference().equals(transactionRef)) {
                return payment;
            }
        }
        return null;
    }
}
