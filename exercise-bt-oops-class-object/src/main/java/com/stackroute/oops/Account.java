package com.stackroute.oops;

/*
   This class is used to store account details
 */
public class Account {
    private int accountNo;
    private double balance;
    private String status;
    private static int counter = 1000;

    public Account(double balance, String status) {
        this.balance = balance;
        this.status = status;
        this.accountNo = ++counter;
    }

    public boolean depositAmount(double amount) {
        if (status.equalsIgnoreCase("active")) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public String getAccountDetails() {
        return "[Account No : " + accountNo + ", Status : " + status + ", Balance : " + balance + "]";
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
