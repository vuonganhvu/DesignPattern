package com.higgsup.designpattern.reflection;

public class ConcreteProduct2 extends Product {
    static {
        Factory.getInstance().registerProduct(ConcreteProduct2.class);
    }

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
