package com.natwest.practice;

import java.util.LinkedList;

class ScoreAnalyzer {
    private LinkedList<Integer> runsData;

    public ScoreAnalyzer() {
        runsData = new LinkedList<>();
    }

    public void addRunsToList(int runs) {
        runsData.add(runs);
    }

    public double calcRunRate() {
        int totalRuns = 0;
        for (int runs : runsData) {
            totalRuns += runs;
        }
        return (double) totalRuns / 50.0;
    }

    // Method to get the lowest runs scored
    public int lowestRunsScored() {
        if (runsData.isEmpty()) {
            return 0;
        }
        int minRuns = runsData.getFirst();
        for (int runs : runsData) {
            if (runs < minRuns) {
                minRuns = runs;
            }
        }
        return minRuns;
    }
    public void displayRuns() {
        System.out.print("Runs Scored: ");
        int playerCount = 1;
        for (int runs : runsData) {
            System.out.print(playerCount + "-" + runs + " ");
            playerCount++;
        }
        System.out.println();
    }
}
