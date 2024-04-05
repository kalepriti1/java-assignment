package com.natwest.practice;
import java.util.Scanner;



public class TestScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScoreAnalyzer scoreAnalyzer = new ScoreAnalyzer();

        String[] runsInput = scanner.nextLine().split(" ");
        for (String run : runsInput) {
            scoreAnalyzer.addRunsToList(Integer.parseInt(run));
        }
        scoreAnalyzer.displayRuns();
        System.out.println("Runrate: " + scoreAnalyzer.calcRunRate());

        System.out.println("Lowest Runs: " + scoreAnalyzer.lowestRunsScored());
        System.out.println("Count of player who batted: " + runsInput.length);

        scanner.close();
    }
}
