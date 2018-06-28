package com.higgsup.designpattern.noob;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product1 = factory.createProduct("product1");
        System.out.println("Product 1 : " + product1.toString());
        Product product2 = factory.createProduct("product2");
        System.out.println("Product 2 : " + product2.toString());
    }
}
