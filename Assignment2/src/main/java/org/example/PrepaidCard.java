package org.example;

public abstract class PrepaidCard {

    protected int cardNo;
    protected double availableBalance;
    protected double swipeLimit;

    // Constructor
    public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
        this.cardNo = cardNo;
        this.availableBalance = availableBalance;
        this.swipeLimit = swipeLimit;
    }

    abstract boolean swipeCard(double amount);

    public void rechargeCard(double amount) {
        availableBalance += amount;

    }

    @Override
    public String toString() {
        return "Prepaidcard{" +
                "cardNo=" + cardNo +
                ", availableBalance=" + availableBalance +
                ", swipeLimit=" + swipeLimit +
                '}';
    }
}