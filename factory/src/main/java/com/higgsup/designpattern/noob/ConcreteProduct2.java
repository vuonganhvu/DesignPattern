package com.higgsup.designpattern.noob;

public class ConcreteProduct2 extends Product {
    private String name = "Concrete product 2";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
