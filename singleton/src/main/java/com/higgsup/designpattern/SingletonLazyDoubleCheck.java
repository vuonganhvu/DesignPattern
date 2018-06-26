package com.higgsup.designpattern;

public class SingletonLazyDoubleCheck {

    private volatile static SingletonLazyDoubleCheck sc = null;
    private String name;

    private SingletonLazyDoubleCheck() {
        this.name = "SingletonLazyDoubleCheck";
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (sc == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (sc == null) {
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }

    public String getName() {
        return name;
    }
}

