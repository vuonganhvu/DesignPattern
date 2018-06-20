package com.higgsup.designpattern.singleton;

public class SingletonLazy {

    private static SingletonLazy sc = null;
    private String name;

    private SingletonLazy() {
        this.name = "SingletonLazy";
    }

    public static SingletonLazy getInstance() {
        if (sc == null) {
            sc = new SingletonLazy();
        }
        return sc;
    }

    public String getName() {
        return name;
    }
}

