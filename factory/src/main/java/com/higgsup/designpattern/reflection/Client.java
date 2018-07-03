package com.higgsup.designpattern.reflection;

public class Client {
    static
    {
        try
        {
            Class.forName("com.higgsup.designpattern.reflection.ConcreteProduct1");
            Class.forName("com.higgsup.designpattern.reflection.ConcreteProduct2");
        }
        catch (ClassNotFoundException any)
        {
            any.printStackTrace();
        }
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Product product1 = Factory.getInstance().createProduct("ConcreteProduct1");
        System.out.println("Product 1 : " + product1.toString());
        Product product2 = Factory.getInstance().createProduct("ConcreteProduct2");
        System.out.println("Product 2 : " + product2.toString());
    }
}
