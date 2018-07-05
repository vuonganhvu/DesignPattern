package com.higgsup.designpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private String state;
    private List<Observer> observers = new ArrayList<>();

    public void updateState(String state) {
        this.state = state;
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> o.update(state));
    }
}
