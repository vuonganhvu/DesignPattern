package com.higgsup.designpattern;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.constructorBuilder();
        System.out.println(product.getField1());
        System.out.println(product.getField2());

    }
}
