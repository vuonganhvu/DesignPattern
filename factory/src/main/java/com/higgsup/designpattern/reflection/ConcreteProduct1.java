package com.higgsup.designpattern.reflection;

public class ConcreteProduct1 extends Product {
    private String name = "Concrete product 1";

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
