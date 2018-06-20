package com.higgsup.designpattern.singleton;

public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded sc = null;
    private String name;

    private SingletonLazyMultithreaded() {
        this.name = "SingletonLazyMultithreaded";
    }

    public static synchronized SingletonLazyMultithreaded getInstance() {
        if (sc == null) {
            sc = new SingletonLazyMultithreaded();
        }
        return sc;
    }

    public String getName() {
        return name;
    }
}

