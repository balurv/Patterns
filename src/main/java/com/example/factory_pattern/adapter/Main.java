package com.example.factory_pattern.adapter;

public class Main {
    public static void main(String[] args) {
        payuMoney obj = new payuMoney();
        String id = obj.payByCreditCard("1234-5678-1357-2468", "369", "23-01-2030");
        obj.checkPaymentStatus(id);
    }
}
