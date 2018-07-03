package com.higgsup.designpattern.avoidReflection;

public class ConcreteProduct1 extends Product {
    static {
        Factory.getInstance().registerProduct(new ConcreteProduct1());
    }
    private String name = "Concrete product 1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Product createObject() {
        return new ConcreteProduct1();
    }

    @Override
    public String toString() {
        return name;
    }
}
