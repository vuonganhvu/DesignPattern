package com.higgsup.designpattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Context contextA = new Context(new ConcreteStrategyA());
        Context contextB = new Context(new ConcreteStrategyB());
        System.out.println("---------------ConcreteStrategyA------------");
        contextA.execute();
        System.out.println("---------------ConcreteStrategyB------------");
        contextB.execute();
    }
}
