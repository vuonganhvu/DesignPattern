package com.higgsup.designpattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        subject.register(observer1);
        ConcreteObserver observer2 = new ConcreteObserver();
        subject.register(observer2);
        ConcreteObserver observer3 = new ConcreteObserver();
        subject.register(observer3);
        ConcreteObserver observer4 = new ConcreteObserver();
        subject.register(observer4);
        System.out.println("----Before change----");
        System.out.println("observer1 has state is " + observer1.getState());
        System.out.println("observer2 has state is " + observer2.getState());
        System.out.println("observer3 has state is " + observer3.getState());
        System.out.println("observer4 has state is " + observer4.getState());
        subject.updateState("IN_ACTIVE");
        System.out.println("----After change----");
        System.out.println("observer1 has state is " + observer1.getState());
        System.out.println("observer2 has state is " + observer2.getState());
        System.out.println("observer3 has state is " + observer3.getState());
        System.out.println("observer4 has state is " + observer4.getState());
    }
}
