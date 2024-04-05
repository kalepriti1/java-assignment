package org.example;

public class Main {
    public static void main(String[] args) {
        TravelCard card = new TravelCard(123456, 5000.0, 10000.0);
        System.out.println(card);

        card.rechargeCard(2000);
        System.out.println(card);

        card.swipeCard(100);
        card.swipeCard(500);
        System.out.println(card);
    }
}