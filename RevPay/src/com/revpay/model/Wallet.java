package com.revpay.model;

public class Wallet {

    private int userId;
    private double balance;

    public Wallet(int userId) {
        this.userId = userId;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public boolean deductMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
