package com.fullstack.observers;

import com.fullstack.ScoreUtils;
import com.fullstack.interfaces.Observer;

public class AverageScoreDisplay implements Observer {

    private int predictedScore;
    private double runRate;

    @Override
    public void updateData(int runs, int balls, int wickets) {
        double overs = ScoreUtils.calculateOvers(balls);

        this.runRate = ScoreUtils.calculateRunRate(runs, overs);
        this.predictedScore = (int) (runRate * 50);

        display();
    }

    public void display() {
        System.out.println("Run Rate: " + runRate + "; Predicted Score: " + predictedScore);
    }
}
