package com.higgsup.designpattern;

public class Singleton {
    private static Singleton sc = new Singleton();
    private String name;

    private Singleton() {
        this.name = "Singleton";
    }

    public static Singleton getInstance() {
        return sc;
    }

    public String getName() {
        return name;
    }
}

