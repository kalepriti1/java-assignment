package com.natwest.java8.Annoymous;
interface Payment{
    void doPayment();
}
public class FunctionInterface2 {
    public static void main(String[] args) {
        Payment payment =  () -> System.out.println("Hello");
        payment.doPayment();
    }
}
