package com.fullstack;

import com.fullstack.Subject.CricketData;
import com.fullstack.observers.AverageScoreDisplay;
import com.fullstack.observers.CricketScoreDisplay;

public class CricketMatch {
    public static void main(String[] args) {

        System.out.println("Cricket match starts!");

        //Match data comes here

        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CricketScoreDisplay cricketScoreDisplay = new CricketScoreDisplay();

        CricketData cricketData = new CricketData();

        cricketData.registerObserver(cricketScoreDisplay);
        cricketData.registerObserver(averageScoreDisplay);

        //For simplicity, player hits 4 every single ball :P
        cricketData.dataChanged();
        cricketData.dataChanged();
        cricketData.dataChanged();
        cricketData.dataChanged();
        cricketData.dataChanged();
        cricketData.dataChanged();
        cricketData.dataChanged();
    }
}
