package org.example;

class TravelCard extends PrepaidCard implements Rewardable {
    private int rewardPoints;
    public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
        super(cardNo, availableBalance, swipeLimit);
        this.rewardPoints = 0;
    }

    @Override
    public boolean swipeCard(double amount) {
        double processingCharge = amount * 0.05;
        double amountWithCharge = amount + processingCharge;

        double amountInINR = amountWithCharge * 60;

        if (amount > swipeLimit || amountInINR > availableBalance) {
            System.out.println("Swipe failed: Exceeds limit or insufficient balance");
            return false;
        }

        availableBalance -= amountInINR;

        rewardPoints += calculateRewardPoints(amount);

        System.out.println("Swipe successful!");
        return true;
    }

    @Override
    public int calculateRewardPoints(double amount) {
        return (int) (amount / 10);
    }

}
