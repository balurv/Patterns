package com.example.factory_pattern.adapter;

public class payuMoney {
    String payByCreditCard(String creditNumber, String cvv, String expiryDate){
        System.out.println("payment done by razorpay");
        return "123";
    }

    boolean checkPaymentStatus(String id){
        return false;
    }
}
