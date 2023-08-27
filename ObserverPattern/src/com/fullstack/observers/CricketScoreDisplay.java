package com.fullstack.observers;

import com.fullstack.interfaces.Observer;
import com.fullstack.ScoreUtils;

public class CricketScoreDisplay implements Observer {

    private int runs;
    private int balls;
    private int wickets;
    private double overs;

    @Override
    public void updateData(int runs, int balls, int wickets) {
        this.runs = runs;
        this.balls = balls;
        this.wickets = wickets;

        this.overs = ScoreUtils.calculateOvers(balls);
        display();
    }

    public void display() {
        System.out.println("Runs: " + runs + "; Overs: " + overs + "; Wickets: " + wickets);
    }
}
