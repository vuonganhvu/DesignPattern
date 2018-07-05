package com.higgsup.designpattern;

public class ConcreteObserver implements Observer {
    private String state = "ACTIVE";

    @Override
    public void update(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConcreteObserver that = (ConcreteObserver) o;

        return state != null ? state.equals(that.state) : that.state == null;
    }

    @Override
    public int hashCode() {
        return state != null ? state.hashCode() : 0;
    }
}
