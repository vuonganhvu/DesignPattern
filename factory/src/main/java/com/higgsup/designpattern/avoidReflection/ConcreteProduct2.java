package com.higgsup.designpattern.avoidReflection;

public class ConcreteProduct2 extends Product {
    static {
        Factory.getInstance().registerProduct(new ConcreteProduct2());
    }

    private String name = "Concrete product 2";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Product createObject() {
        return new ConcreteProduct2();
    }

    @Override
    public String toString() {
        return name;
    }
}
