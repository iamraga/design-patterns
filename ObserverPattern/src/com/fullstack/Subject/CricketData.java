package com.fullstack.Subject;

import com.fullstack.interfaces.Observer;
import com.fullstack.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {

    private List<Observer> observerList;
    private int runs;
    private int wickets;
    private int balls;

    public CricketData() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deRegisterObserver(Observer observer) {
        observerList.remove(observerList.indexOf(observer));
    }

    @Override
    public void notifyObservers() {

        observerList.stream().forEach(eachObs ->
                eachObs.updateData(runs, balls, wickets)
        );

    }

    private int getLatestRuns() {
        return this.runs + 4;
    }

    private int getLatestBalls() {
        return this.balls + 1;
    }

    private int getLatestWickets() {
        return 0;
    }

    public void dataChanged() {
        runs = getLatestRuns();
        balls = getLatestBalls();
        wickets = getLatestWickets();

        notifyObservers();
    }
}
