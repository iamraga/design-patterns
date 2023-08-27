package com.fullstack.interfaces;

public interface Subject {
    public void registerObserver(Observer observer);
    public void deRegisterObserver(Observer observer);
    public void notifyObservers();
}
